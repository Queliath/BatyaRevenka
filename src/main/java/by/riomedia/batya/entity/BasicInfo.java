package by.riomedia.batya.entity;

import javax.persistence.*;

@Entity
@Table(name = "br_basic_info")
public class BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "info_type")
    private String infoType;
    @Column(name = "info_data")
    private String infoData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoData() {
        return infoData;
    }

    public void setInfoData(String infoData) {
        this.infoData = infoData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasicInfo basicInfo = (BasicInfo) o;

        return id != null ? id.equals(basicInfo.id) : basicInfo.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
