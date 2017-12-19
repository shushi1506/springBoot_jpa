
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmBhxhSOAResult" type="{http://teca.com/sms/generated/ws/vsa}dmBhxhSOAResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getDmBhxhSOAResponse", namespace = "http://teca.com/sms/generated/ws/vsa")
public class GetDmBhxhSOAResponse {
    @XmlElement(name = "dmBhxhSOAResult")
    protected List<DmBhxhSOAResult> dmBhxhSOAResult = null;

    public List<DmBhxhSOAResult> getDmBhxhSOAResult() {
        if (dmBhxhSOAResult == null) {
            dmBhxhSOAResult = new ArrayList<DmBhxhSOAResult>();
        }
        return this.dmBhxhSOAResult;
    }

    public void setDmBhxhSOAResult(List<DmBhxhSOAResult> dmBhxhSOAResult) {
        this.dmBhxhSOAResult = dmBhxhSOAResult;
    }
}
