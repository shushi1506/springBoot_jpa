package bhxh.controller.rest;

import bhxh.data.BaseResponse;
import bhxh.data.CqbhTinhResponse;
import bhxh.data.model.CommonDmCqbhTinhCustomer;
import bhxh.data.repository.CmDmTinh2Repository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iamSync")
@Configuration
@ComponentScan("bhxh.data.repository")
public class CmDmTinhController {
    private static final Logger logger = Logger.getLogger(CmDmTinhController.class);
    @Autowired
    CmDmTinh2Repository cmDmTinh2Repository;
    @GetMapping("/test/getdata/{ma}")
    public BaseResponse<Object[]> getData(@PathVariable("ma") final String ma) {
        BaseResponse response = new BaseResponse();
        List<Object[]> list = cmDmTinh2Repository.findAllCommonDmCqbhTinh();
        response.setErrorCode("00");
        response.setMessage("success" + list.size());
        response.setList(list);
        return response;
    }
    @GetMapping(value = "/test/getdata/cqbhTinh/{page}",produces = MediaType.APPLICATION_XML_VALUE,headers = "Accept=application/xml")
    public BaseResponse<Object[]> getDataCqbhTinh(@PathVariable("page") String page) {
        BaseResponse response = new BaseResponse();
        List<CommonDmCqbhTinhCustomer> list = cmDmTinh2Repository.findAll();
        response.setErrorCode("00");
        response.setMessage("success" + list.size());
        response.setList(list);
        return response;
    }
    @RequestMapping(value = "/test/getdata/cqbhTinh/xml",produces = MediaType.APPLICATION_XML_VALUE,headers = "Accept=application/xml",method = RequestMethod.GET)
    public CqbhTinhResponse getDataCqbhTinh1() {
        CqbhTinhResponse response = new CqbhTinhResponse();
        List<CommonDmCqbhTinhCustomer> list = cmDmTinh2Repository.findAll();
        response.setErrorCode("00");
        response.setMessage("success" + list.size());
        response.setCqbhTinhCustomers(list);
//        response.setErrorCode("00");
//        response.setMessage("success" + list.size());
//        response.setCqbhTinhCustomers(list);
        return response;
    }
}
