package com.autotest.check_cimload.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class Imid_daily_Id implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "imid_nbr")
    private String imid_nbr;
    @Column(name = "imid_source")
    private String imid_source;

    public String getImid_nbr() {
        return imid_nbr;
    }

    public void setImid_nbr(String imid_nbr) {
        this.imid_nbr = imid_nbr;
    }

    public String getImid_source() {
        return imid_source;
    }

    public void setImid_source(String imid_source) {
        this.imid_source = imid_source;
    }

    public Imid_daily_Id() {
    }

    public Imid_daily_Id(String imid_nbr, String imid_source) {
        this.imid_nbr = imid_nbr;
        this.imid_source = imid_source;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Imid_daily_Id that = (Imid_daily_Id) o;
        return Objects.equals(imid_nbr, that.imid_nbr) && Objects.equals(imid_source, that.imid_source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imid_nbr, imid_source);
    }
}
