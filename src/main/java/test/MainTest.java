package test;

import bhxh.soap.entity.GetDmKhoiKcbSOAResponse;
import bhxh.utils.Config;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.util.ArrayList;
import java.util.LinkedList;

import static bhxh.soap.CallSoapService.callSoapWebService;
import static bhxh.utils.Config.OBJECT_CM_DM_KHOI_KCB;
import static bhxh.utils.Config.TABLE_CM_DM_KHOI_KCB;


public class MainTest {
    public static void main(String[] args) {
//        verifyOrSyncDataDmKhoiKCB(1);
        Boolean tem = Boolean.parseBoolean("");
        if (tem) System.out.println("dfasdf");
    }

//    private static boolean verifyOrSyncDataDmKhoiKCB() {
//        boolean temp = false;
//        ArrayList<String> arrayList = null;
//        LinkedList<Object[]> lstObject = new LinkedList<>();
//        try {
//            arrayList = new ArrayList<>();
//            arrayList.add("");
//            SOAPMessage soapMessage = callSoapWebService(Config.URL_SERVICE_VSA, Config.SOAPACTION_DM_KHOI_KCB_SOA, arrayList);
//            if (soapMessage != null) {
//                Unmarshaller unmarshaller = JAXBContext.newInstance(GetDmKhoiKcbSOAResponse.class).createUnmarshaller();
//                GetDmKhoiKcbSOAResponse lstKhoiKCB = (GetDmKhoiKcbSOAResponse) unmarshaller.unmarshal(soapMessage.getSOAPBody().extractContentAsDocument());
//                for (int j = 0; lstKhoiKCB != null && j < lstKhoiKCB.getDmKhoiKcbSOAResult().size(); j++) {
//                    lstObject.add(lstKhoiKCB.getDmKhoiKcbSOAResult().get(j).toObject());
//                }
//            }
//        } catch (SOAPException e) {
//            e.printStackTrace();
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return temp;
//    }
}
