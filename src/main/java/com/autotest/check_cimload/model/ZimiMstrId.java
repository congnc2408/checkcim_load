package com.autotest.check_cimload.model;




import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class ZimiMstrId implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column(name = "zimi_id")
    private String zIMI_Id;
    
    @Column(name = "zimi_site")
    private String zIMI_Site;

    public String getzIMI_Id() {
        return zIMI_Id;
    }

    public void setzIMI_Id(String zIMI_Id) {
        this.zIMI_Id = zIMI_Id;
    }

    public String getzIMI_Site() {
        return zIMI_Site;
    }

    public void setzIMI_Site(String zIMI_Site) {
        this.zIMI_Site = zIMI_Site;
    }

    public ZimiMstrId(String zIMI_Id, String zIMI_Site) {
        this.zIMI_Id = zIMI_Id;
        this.zIMI_Site = zIMI_Site;
    }

    public ZimiMstrId() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ZimiMstrId that = (ZimiMstrId) o;
        return Objects.equals(zIMI_Id, that.zIMI_Id) && Objects.equals(zIMI_Site, that.zIMI_Site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zIMI_Id, zIMI_Site);
    }
}
