package bhxh.controller.rest;

import bhxh.controller.process.DMProcess;
import bhxh.data.BaseResponse;
import bhxh.data.model.CommonDmKhoiQuanLy;
import bhxh.data.model.CommonDmPhongBan;
import bhxh.data.repository.CmDmPhongBanRepository;
import bhxh.data.repository.CmDmQuanLyRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iamSync")
@Configuration
@ComponentScan("bhxh.data.repository")
public class CmDmQuanLyController {
    private static final Logger logger = Logger.getLogger(CmDmQuanLyController.class);
    @Autowired
    CmDmQuanLyRepository cmDmQuanLyRepository;

//    @PersistenceContext
//    private EntityManager entityManager;

    //    @Value("${hibernate.jdbc.batch_size}")
    private int batchSize = 20;

    @GetMapping("/ql/all")
    public List<CommonDmKhoiQuanLy> getAll() {
        return cmDmQuanLyRepository.findAll();
    }

    @GetMapping(value = "/ql/all/{page}",produces = MediaType.APPLICATION_JSON_VALUE,headers = "Accept=application/json")
    public List<CommonDmKhoiQuanLy> getAll(@PathVariable("page") final int page) {
        return cmDmQuanLyRepository.findAll(new QPageRequest(page, 20)).getContent();
    }

    @GetMapping("/ql/sync")
    public BaseResponse syncPhongBan() {
        BaseResponse response = new BaseResponse();
//        GetDmBhxhSOAResponse bhxh = DMProcess.processDmBHXH();
        List<CommonDmKhoiQuanLy> lstObject = DMProcess.processDmKhoiQL();
        logger.info("List khoi QL size= " + lstObject.size());
        lstObject = cmDmQuanLyRepository.save(lstObject);
        logger.info("End insert - " + lstObject.size());
        response.setErrorCode("00");
        response.setMessage("success");
        return response;
    }


//    public Collection<CommonDmKhoiKcb> bulkSave(List<CommonDmKhoiKcb> entities) {
//        final List<CommonDmKhoiKcb> savedEntities = new ArrayList<CommonDmKhoiKcb>(entities.size());
//        int i = 0;
//        for (CommonDmKhoiKcb t : entities) {
//            savedEntities.add(persistOrMerge(t));
//            i++;
//            if (i % batchSize == 0) {
//                // Flush a batch of inserts and release memory.
//                entityManager.flush();
//                entityManager.clear();
//                System.out.println("success");
//            }
//        }
//        return savedEntities;
//    }
//
//    private CommonDmKhoiKcb persistOrMerge(CommonDmKhoiKcb t) {
////        if (null == t.getId()) {
//        entityManager.persist(t);
//        return t;
////        } else {
////        return entityManager.merge(t);
////        }
//    }


}
