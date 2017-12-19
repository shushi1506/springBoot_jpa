package bhxh.data.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author tuananh 12/15/2017
 * service-sync-data
 * bhxh.data.model
 */
@XmlRootElement(name = "COMMON_DM_CQBH_TINH")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "COMMON_DM_CQBH_TINH", schema = "CATEGORYUSER")
public class CommonDmCqbhTinhCustomer implements Serializable {
    private long id;
    @XmlElement(name = "maCqbhTinhasd")
    private String maCqbhTinh;
    @XmlElement(name = "tenCqbhTinh")
    private String tenCqbhTinh;
    @XmlElement(name = "diaChi")
    private String diaChi;
    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_CQBH_TINH")
    public String getMaCqbhTinh() {
        return maCqbhTinh;
    }

    public void setMaCqbhTinh(String maCqbhTinh) {
        this.maCqbhTinh = maCqbhTinh;
    }

    @Basic
    @Column(name = "TEN_CQBH_TINH")
    public String getTenCqbhTinh() {
        return tenCqbhTinh;
    }

    public void setTenCqbhTinh(String tenCqbhTinh) {
        this.tenCqbhTinh = tenCqbhTinh;
    }

    @Basic
    @Column(name = "DIA_CHI")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}

