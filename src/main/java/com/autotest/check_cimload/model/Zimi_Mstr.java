package com.autotest.check_cimload.model;


import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "zimi_mstr")
public class Zimi_Mstr {
    @EmbeddedId
    private  ZimiMstrId id;
    @Column(name = "zimi_decision")
    private  String zIMI_Decision;
    @Column(name = "zimi_part")
    private  String zIMI_Part;
    @Column(name = "zimi_sample")
    private  int zIMI_Sample;
    @Column(name = "zimi_mrbcode")
    private  String zIMI_Mrbcode;
    @Column(name = "zimi_defqty")
    private  int zIMI_Defqty;
    @Column(name = "zimi_mrbcode1")
    private  String zIMI_Mrbcode1;
    @Column(name = "zimi_defqty1")
    private  int zIMI_Defqty1;
    @Column(name = "zimi_mrbcode2")
    private  String zIMI_Mrbcode2;
    @Column(name = "zimi_defqty2")
    private  int zIMI_Defqty2;
    @Column(name = "zimi_insp")
    private  String zIMI_Insp;
    @Column(name = "zimi_mrbstat")
    private  String zIMI_Mrbstat;
    @Column(name = "zimi_vend")
    private  String zIMI_Vendor;
    @Column(name = "zimi_rcpdate")
    private Date zIMI_Rcpdate;
    @Column(name = "zimi_buyer")
    private  String zIMI_Buyer;

    public Zimi_Mstr() {
    }

    public Zimi_Mstr(String zIMI_id,String zIMI_Site, String zIMI_Decision, String zIMI_Part,
                     int zIMI_Sample, String zIMI_Mrbcode, int zIMI_Defqty, String zIMI_Mrbcode1,
                     int zIMI_Defqty1, String zIMI_Mrbcode2, int zIMI_Defqty2, String zIMI_Insp,
                     String zIMI_Mrbstat, String zIMI_Vendor, Date zIMI_Rcpdate, String zIMI_Buyer) {
        this.id = new ZimiMstrId(zIMI_id, zIMI_Site);
        this.zIMI_Decision = zIMI_Decision;
        this.zIMI_Part = zIMI_Part;
        this.zIMI_Sample = zIMI_Sample;
        this.zIMI_Mrbcode = zIMI_Mrbcode;
        this.zIMI_Defqty = zIMI_Defqty;
        this.zIMI_Mrbcode1 = zIMI_Mrbcode1;
        this.zIMI_Defqty1 = zIMI_Defqty1;
        this.zIMI_Mrbcode2 = zIMI_Mrbcode2;
        this.zIMI_Defqty2 = zIMI_Defqty2;
        this.zIMI_Insp = zIMI_Insp;
        this.zIMI_Mrbstat = zIMI_Mrbstat;
        this.zIMI_Vendor = zIMI_Vendor;
        this.zIMI_Rcpdate = zIMI_Rcpdate;
        this.zIMI_Buyer = zIMI_Buyer;
    }

    // Constructor to match the HQL query
    public Zimi_Mstr(
            String zimiId,
            String zimiDecision,
            String zimiPart,
            int zimiSample,
            String zimiInsp,
            String zimiSite,
            String zimiVendor,
            java.util.Date zimiRcpdate,
            String zimiBuyer
    ) {
        this.id = new ZimiMstrId(zimiId, zimiSite);
        this.zIMI_Decision = zimiDecision;
        this.zIMI_Part = zimiPart;
        this.zIMI_Sample = zimiSample;
        this.zIMI_Insp = zimiInsp;
        this.zIMI_Vendor = zimiVendor;
        this.zIMI_Rcpdate = zimiRcpdate;
        this.zIMI_Buyer = zimiBuyer;
    }

    public ZimiMstrId getId() {
        return id;
    }

    public void setId(ZimiMstrId id) {
        this.id = id;
    }

    public String getzIMI_Decision() {
        return zIMI_Decision;
    }

    public void setzIMI_Decision(String zIMI_Decision) {
        this.zIMI_Decision = zIMI_Decision;
    }

    public String getzIMI_Part() {
        return zIMI_Part;
    }

    public void setzIMI_Part(String zIMI_Part) {
        this.zIMI_Part = zIMI_Part;
    }

    public int getzIMI_Sample() {
        return zIMI_Sample;
    }

    public void setzIMI_Sample(int zIMI_Sample) {
        this.zIMI_Sample = zIMI_Sample;
    }

    public String getzIMI_Mrbcode() {
        return zIMI_Mrbcode;
    }

    public void setzIMI_Mrbcode(String zIMI_Mrbcode) {
        this.zIMI_Mrbcode = zIMI_Mrbcode;
    }

    public int getzIMI_Defqty() {
        return zIMI_Defqty;
    }

    public void setzIMI_Defqty(int zIMI_Defqty) {
        this.zIMI_Defqty = zIMI_Defqty;
    }

    public String getzIMI_Mrbcode1() {
        return zIMI_Mrbcode1;
    }

    public void setzIMI_Mrbcode1(String zIMI_Mrbcode1) {
        this.zIMI_Mrbcode1 = zIMI_Mrbcode1;
    }

    public int getzIMI_Defqty1() {
        return zIMI_Defqty1;
    }

    public void setzIMI_Defqty1(int zIMI_Defqty1) {
        this.zIMI_Defqty1 = zIMI_Defqty1;
    }

    public String getzIMI_Mrbcode2() {
        return zIMI_Mrbcode2;
    }

    public void setzIMI_Mrbcode2(String zIMI_Mrbcode2) {
        this.zIMI_Mrbcode2 = zIMI_Mrbcode2;
    }

    public int getzIMI_Defqty2() {
        return zIMI_Defqty2;
    }

    public void setzIMI_Defqty2(int zIMI_Defqty2) {
        this.zIMI_Defqty2 = zIMI_Defqty2;
    }

    public String getzIMI_Insp() {
        return zIMI_Insp;
    }

    public void setzIMI_Insp(String zIMI_Insp) {
        this.zIMI_Insp = zIMI_Insp;
    }

    public String getzIMI_Mrbstat() {
        return zIMI_Mrbstat;
    }

    public void setzIMI_Mrbstat(String zIMI_Mrbstat) {
        this.zIMI_Mrbstat = zIMI_Mrbstat;
    }

    public String getzIMI_Vendor() {
        return zIMI_Vendor;
    }

    public void setzIMI_Vendor(String zIMI_Vendor) {
        this.zIMI_Vendor = zIMI_Vendor;
    }

    public Date getzIMI_Rcpdate() {
        return zIMI_Rcpdate;
    }

    public void setzIMI_Rcpdate(Date zIMI_Rcpdate) {
        this.zIMI_Rcpdate = zIMI_Rcpdate;
    }

    public String getzIMI_Buyer() {
        return zIMI_Buyer;
    }

    public void setzIMI_Buyer(String zIMI_Buyer) {
        this.zIMI_Buyer = zIMI_Buyer;
    }

    @Override
    public String toString() {
        return "Zimi_Mstr{" +
                "zIMI_Id=" + id +
                ", zIMI_Decision='" + zIMI_Decision + '\'' +
                ", zIMI_Part='" + zIMI_Part + '\'' +
                ", zIMI_Sample=" + zIMI_Sample +
                ", zIMI_Mrbcode='" + zIMI_Mrbcode + '\'' +
                ", zIMI_Defqty=" + zIMI_Defqty +
                ", zIMI_Mrbcode1='" + zIMI_Mrbcode1 + '\'' +
                ", zIMI_Defqty1=" + zIMI_Defqty1 +
                ", zIMI_Mrbcode2='" + zIMI_Mrbcode2 + '\'' +
                ", zIMI_Defqty2=" + zIMI_Defqty2 +
                ", zIMI_Insp='" + zIMI_Insp + '\'' +
                ", zIMI_Mrbstat='" + zIMI_Mrbstat + '\'' +
                ", zIMI_Vendor='" + zIMI_Vendor + '\'' +
                ", zIMI_Rcpdate=" + zIMI_Rcpdate +
                ", zIMI_Buyer='" + zIMI_Buyer + '\'' +
                '}';
    }
}
