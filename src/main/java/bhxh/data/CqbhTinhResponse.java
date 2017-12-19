package bhxh.data;


import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author tuananh 12/16/2017
 * service-sync-data
 * bhxh.controller
 */
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class CqbhTinhResponse<T> implements Serializable {
    private String errorCode;
    @XmlElement(name = "mess")
    private String message;
    private List<T> cqbhTinhCustomers;

    public CqbhTinhResponse() {
    }

    public CqbhTinhResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElement(name = "common")
    public List<T> getCqbhTinhCustomers() {
        return cqbhTinhCustomers;
    }

    public void setCqbhTinhCustomers(List<T> cqbhTinhCustomers) {
        this.cqbhTinhCustomers = cqbhTinhCustomers;
    }
}
