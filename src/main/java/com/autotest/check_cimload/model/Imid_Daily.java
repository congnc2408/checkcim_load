package com.autotest.check_cimload.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "imid_daily")
public class Imid_Daily {

    @EmbeddedId
    private Imid_daily_Id id;
    @Column(name = "imid_rcp_date")
    private Date imid_rcp_date;
    @Column(name = "imid_po_nbr")
    private String imid_po_nbr;
    @Column(name = "imid_part")
    private String imid_part;
    @Column(name = "imid_ps_nbr")
    private String imid_ps_nbr;
    @Column(name = "imid_pt_desc1")
    private String imid_pt_desc1;
    @Column(name = "imid_pt_desc2")
    private String imid_pt_desc2;
    @Column(name = "imid_vend")
    private String imid_vend;
    @Column(name = "imid_vd_desc")
    private String imid_vd_desc;
    @Column(name = "imid_rcvd")
    private Double imid_rcvd;
    @Column(name = "imid_qty_ctn")
    private int imid_qty_ctn;
    @Column(name = "imid_mfgr_desc")
    private String imid_mfgr_desc;
    @Column(name = "imid_mfgr_part")
    private String imid_mfgr_part;
    @Column(name = "imid_mfgr_lot")
    private String imid_mfgr_lot;
    @Column(name = "imid_mfgr_dcode")
    private String imid_mfgr_dcode;
    @Column(name = "imid_expiry_date")
    private Date imid_expiry_date;
    @Column(name = "imid_trace_type")
    private String imid_trace_type;
    @Column(name = "imid_label_qty")
    private int imid_label_qty;
    @Column(name = "imid_label_printed")
    private String imid_label_printed;
    @Column(name = "imid_rohs")
    private String imid_rohs;
    @Column(name = "imid_xrf_nbr")
    private String imid_xrf_nbr;
    @Column(name = "imid_rohs_pass")
    private String imid_rohs_pass;
    @Column(name = "imid_idx_maj")
    private Double imid_idx_maj;
    @Column(name = "imid_idx_min")
    private Double imid_idx_min;
    @Column(name = "imid_insp_pass")
    private String imid_insp_pass;
    @Column(name = "imid_pass")
    private String imid_pass;
    @Column(name = "imid_mrb_result")
    private String imid_mrb_result;
    @Column(name = "imid_mrb_purusr")
    private String imid_mrb_purusr;
    @Column(name = "imid_mrb_purdate")
    private Date imid_mrb_purdate;
    @Column(name = "imid_mrb_qausr")
    private String imid_mrb_qausr;
    @Column(name = "imid_mrb_qadate")
    private Date imid_mrb_qadate;
    @Column(name = "imid_mrb_pieusr")
    private String imid_mrb_pieusr;
    @Column(name = "imid_mrb_piedate")
    private Date imid_mrb_piedate;
    @Column(name = "imid_mrb_pmcusr")
    private String imid_mrb_pmcusr;
    @Column(name = "imid_mrb_pmcdate")
    private Date imid_mrb_pmcdate;
    @Column(name = "imid_mrb_apprusr")
    private String imid_mrb_apprusr;
    @Column(name = "imid_mrb_apprdate")
    private Date imid_mrb_apprdate;
    @Column(name = "imid_mrb_labor")
    private Double imid_mrb_labor;
    @Column(name = "imid_mrb_vend")
    private String imid_mrb_vend;
    @Column(name = "imid_mrb_vlabor")
    private Double imid_mrb_vlabor;
    @Column(name = "imid_mrb_uai")
    private Double imid_mrb_uai;
    @Column(name = "imid_mrb_rtv")
    private Double imid_mrb_rtv;
    @Column(name = "imid_mrb_follow")
    private String imid_mrb_follow;
    @Column(name = "imid_mrb_fnbr")
    private String imid_mrb_fnbr;
    @Column(name = "imid_appr_status")
    private String imid_appr_status;
    @Column(name = "imid_insp_date")
    private Date imid_insp_date;
    @Column(name = "imid_insp_usr")
    private String imid_insp_usr;
    @Column(name = "imid_check_date")
    private Date imid_check_date;
    @Column(name = "imid_check_usr")
    private String imid_check_usr;
    @Column(name = "imid_verify_date")
    private Date imid_verify_date;
    @Column(name = "imid_verify_usr")
    private String imid_verify_usr;
    @Column(name = "imid_hrisk_nbr")
    private String imid_hrisk_nbr;
    @Column(name = "imid_coc_nbr")
    private String imid_coc_nbr;
    @Column(name = "imid_mod_date")
    private Date imid_mod_date;
    @Column(name = "imid_mod_usr")
    private String imid_mod_usr;
    @Column(name = "imid_is_sync_epicor")
    private String imid_is_sync_epicor;


    public Imid_Daily() {
    }

    public Imid_Daily(String imid_nbr,String imid_source, Date imid_rcp_date, String imid_po_nbr, String imid_part, String imid_ps_nbr, String imid_pt_desc1, String imid_pt_desc2, String imid_vend, String imid_vd_desc, Double imid_rcvd, int imid_qty_ctn, String imid_mfgr_desc, String imid_mfgr_part, String imid_mfgr_lot, String imid_mfgr_dcode, Date imid_expiry_date, String imid_trace_type, int imid_label_qty, String imid_label_printed, String imid_rohs, String imid_xrf_nbr, String imid_rohs_pass, Double imid_idx_maj, Double imid_idx_min, String imid_insp_pass, String imid_pass, String imid_mrb_result, String imid_mrb_purusr, Date imid_mrb_purdate, String imid_mrb_qausr, Date imid_mrb_qadate, String imid_mrb_pieusr, Date imid_mrb_piedate, String imid_mrb_pmcusr, Date imid_mrb_pmcdate, String imid_mrb_apprusr, Date imid_mrb_apprdate, Double imid_mrb_labor, String imid_mrb_vend, Double imid_mrb_vlabor, Double imid_mrb_uai, Double imid_mrb_rtv, String imid_mrb_follow, String imid_mrb_fnbr, String imid_appr_status, Date imid_insp_date, String imid_insp_usr, Date imid_check_date, String imid_check_usr, Date imid_verify_date, String imid_verify_usr, String imid_hrisk_nbr, String imid_coc_nbr, Date imid_mod_date, String imid_mod_usr, String imid_is_sync_epicor) {
        this.id = new Imid_daily_Id(imid_nbr,imid_source);
        this.imid_rcp_date = imid_rcp_date;
        this.imid_po_nbr = imid_po_nbr;
        this.imid_part = imid_part;
        this.imid_ps_nbr = imid_ps_nbr;
        this.imid_pt_desc1 = imid_pt_desc1;
        this.imid_pt_desc2 = imid_pt_desc2;
        this.imid_vend = imid_vend;
        this.imid_vd_desc = imid_vd_desc;
        this.imid_rcvd = imid_rcvd;
        this.imid_qty_ctn = imid_qty_ctn;
        this.imid_mfgr_desc = imid_mfgr_desc;
        this.imid_mfgr_part = imid_mfgr_part;
        this.imid_mfgr_lot = imid_mfgr_lot;
        this.imid_mfgr_dcode = imid_mfgr_dcode;
        this.imid_expiry_date = imid_expiry_date;
        this.imid_trace_type = imid_trace_type;
        this.imid_label_qty = imid_label_qty;
        this.imid_label_printed = imid_label_printed;
        this.imid_rohs = imid_rohs;
        this.imid_xrf_nbr = imid_xrf_nbr;
        this.imid_rohs_pass = imid_rohs_pass;
        this.imid_idx_maj = imid_idx_maj;
        this.imid_idx_min = imid_idx_min;
        this.imid_insp_pass = imid_insp_pass;
        this.imid_pass = imid_pass;
        this.imid_mrb_result = imid_mrb_result;
        this.imid_mrb_purusr = imid_mrb_purusr;
        this.imid_mrb_purdate = imid_mrb_purdate;
        this.imid_mrb_qausr = imid_mrb_qausr;
        this.imid_mrb_qadate = imid_mrb_qadate;
        this.imid_mrb_pieusr = imid_mrb_pieusr;
        this.imid_mrb_piedate = imid_mrb_piedate;
        this.imid_mrb_pmcusr = imid_mrb_pmcusr;
        this.imid_mrb_pmcdate = imid_mrb_pmcdate;
        this.imid_mrb_apprusr = imid_mrb_apprusr;
        this.imid_mrb_apprdate = imid_mrb_apprdate;
        this.imid_mrb_labor = imid_mrb_labor;
        this.imid_mrb_vend = imid_mrb_vend;
        this.imid_mrb_vlabor = imid_mrb_vlabor;
        this.imid_mrb_uai = imid_mrb_uai;
        this.imid_mrb_rtv = imid_mrb_rtv;
        this.imid_mrb_follow = imid_mrb_follow;
        this.imid_mrb_fnbr = imid_mrb_fnbr;
        this.imid_appr_status = imid_appr_status;
        this.imid_insp_date = imid_insp_date;
        this.imid_insp_usr = imid_insp_usr;
        this.imid_check_date = imid_check_date;
        this.imid_check_usr = imid_check_usr;
        this.imid_verify_date = imid_verify_date;
        this.imid_verify_usr = imid_verify_usr;
        this.imid_hrisk_nbr = imid_hrisk_nbr;
        this.imid_coc_nbr = imid_coc_nbr;
        this.imid_mod_date = imid_mod_date;
        this.imid_mod_usr = imid_mod_usr;
        this.imid_is_sync_epicor = imid_is_sync_epicor;
    }

    public Imid_daily_Id getId() {
        return id;
    }

    public void setId(Imid_daily_Id id) {
        this.id = id;
    }

    public Date getImid_rcp_date() {
        return imid_rcp_date;
    }

    public void setImid_rcp_date(Date imid_rcp_date) {
        this.imid_rcp_date = imid_rcp_date;
    }

    public String getImid_po_nbr() {
        return imid_po_nbr;
    }

    public void setImid_po_nbr(String imid_po_nbr) {
        this.imid_po_nbr = imid_po_nbr;
    }

    public String getImid_part() {
        return imid_part;
    }

    public void setImid_part(String imid_part) {
        this.imid_part = imid_part;
    }

    public String getImid_ps_nbr() {
        return imid_ps_nbr;
    }

    public void setImid_ps_nbr(String imid_ps_nbr) {
        this.imid_ps_nbr = imid_ps_nbr;
    }

    public String getImid_pt_desc1() {
        return imid_pt_desc1;
    }

    public void setImid_pt_desc1(String imid_pt_desc1) {
        this.imid_pt_desc1 = imid_pt_desc1;
    }

    public String getImid_pt_desc2() {
        return imid_pt_desc2;
    }

    public void setImid_pt_desc2(String imid_pt_desc2) {
        this.imid_pt_desc2 = imid_pt_desc2;
    }

    public String getImid_vend() {
        return imid_vend;
    }

    public void setImid_vend(String imid_vend) {
        this.imid_vend = imid_vend;
    }

    public String getImid_vd_desc() {
        return imid_vd_desc;
    }

    public void setImid_vd_desc(String imid_vd_desc) {
        this.imid_vd_desc = imid_vd_desc;
    }

    public Double getImid_rcvd() {
        return imid_rcvd;
    }

    public void setImid_rcvd(Double imid_rcvd) {
        this.imid_rcvd = imid_rcvd;
    }

    public int getImid_qty_ctn() {
        return imid_qty_ctn;
    }

    public void setImid_qty_ctn(int imid_qty_ctn) {
        this.imid_qty_ctn = imid_qty_ctn;
    }

    public String getImid_mfgr_desc() {
        return imid_mfgr_desc;
    }

    public void setImid_mfgr_desc(String imid_mfgr_desc) {
        this.imid_mfgr_desc = imid_mfgr_desc;
    }

    public String getImid_mfgr_part() {
        return imid_mfgr_part;
    }

    public void setImid_mfgr_part(String imid_mfgr_part) {
        this.imid_mfgr_part = imid_mfgr_part;
    }

    public String getImid_mfgr_lot() {
        return imid_mfgr_lot;
    }

    public void setImid_mfgr_lot(String imid_mfgr_lot) {
        this.imid_mfgr_lot = imid_mfgr_lot;
    }

    public String getImid_mfgr_dcode() {
        return imid_mfgr_dcode;
    }

    public void setImid_mfgr_dcode(String imid_mfgr_dcode) {
        this.imid_mfgr_dcode = imid_mfgr_dcode;
    }

    public Date getImid_expiry_date() {
        return imid_expiry_date;
    }

    public void setImid_expiry_date(Date imid_expiry_date) {
        this.imid_expiry_date = imid_expiry_date;
    }

    public String getImid_trace_type() {
        return imid_trace_type;
    }

    public void setImid_trace_type(String imid_trace_type) {
        this.imid_trace_type = imid_trace_type;
    }

    public int getImid_label_qty() {
        return imid_label_qty;
    }

    public void setImid_label_qty(int imid_label_qty) {
        this.imid_label_qty = imid_label_qty;
    }

    public String getImid_label_printed() {
        return imid_label_printed;
    }

    public void setImid_label_printed(String imid_label_printed) {
        this.imid_label_printed = imid_label_printed;
    }

    public String getImid_rohs() {
        return imid_rohs;
    }

    public void setImid_rohs(String imid_rohs) {
        this.imid_rohs = imid_rohs;
    }

    public String getImid_xrf_nbr() {
        return imid_xrf_nbr;
    }

    public void setImid_xrf_nbr(String imid_xrf_nbr) {
        this.imid_xrf_nbr = imid_xrf_nbr;
    }

    public String getImid_rohs_pass() {
        return imid_rohs_pass;
    }

    public void setImid_rohs_pass(String imid_rohs_pass) {
        this.imid_rohs_pass = imid_rohs_pass;
    }

    public Double getImid_idx_maj() {
        return imid_idx_maj;
    }

    public void setImid_idx_maj(Double imid_idx_maj) {
        this.imid_idx_maj = imid_idx_maj;
    }

    public Double getImid_idx_min() {
        return imid_idx_min;
    }

    public void setImid_idx_min(Double imid_idx_min) {
        this.imid_idx_min = imid_idx_min;
    }

    public String getImid_insp_pass() {
        return imid_insp_pass;
    }

    public void setImid_insp_pass(String imid_insp_pass) {
        this.imid_insp_pass = imid_insp_pass;
    }

    public String getImid_pass() {
        return imid_pass;
    }

    public void setImid_pass(String imid_pass) {
        this.imid_pass = imid_pass;
    }

    public String getImid_mrb_result() {
        return imid_mrb_result;
    }

    public void setImid_mrb_result(String imid_mrb_result) {
        this.imid_mrb_result = imid_mrb_result;
    }

    public String getImid_mrb_purusr() {
        return imid_mrb_purusr;
    }

    public void setImid_mrb_purusr(String imid_mrb_purusr) {
        this.imid_mrb_purusr = imid_mrb_purusr;
    }

    public Date getImid_mrb_purdate() {
        return imid_mrb_purdate;
    }

    public void setImid_mrb_purdate(Date imid_mrb_purdate) {
        this.imid_mrb_purdate = imid_mrb_purdate;
    }

    public String getImid_mrb_qausr() {
        return imid_mrb_qausr;
    }

    public void setImid_mrb_qausr(String imid_mrb_qausr) {
        this.imid_mrb_qausr = imid_mrb_qausr;
    }

    public Date getImid_mrb_qadate() {
        return imid_mrb_qadate;
    }

    public void setImid_mrb_qadate(Date imid_mrb_qadate) {
        this.imid_mrb_qadate = imid_mrb_qadate;
    }

    public String getImid_mrb_pieusr() {
        return imid_mrb_pieusr;
    }

    public void setImid_mrb_pieusr(String imid_mrb_pieusr) {
        this.imid_mrb_pieusr = imid_mrb_pieusr;
    }

    public Date getImid_mrb_piedate() {
        return imid_mrb_piedate;
    }

    public void setImid_mrb_piedate(Date imid_mrb_piedate) {
        this.imid_mrb_piedate = imid_mrb_piedate;
    }

    public String getImid_mrb_pmcusr() {
        return imid_mrb_pmcusr;
    }

    public void setImid_mrb_pmcusr(String imid_mrb_pmcusr) {
        this.imid_mrb_pmcusr = imid_mrb_pmcusr;
    }

    public Date getImid_mrb_pmcdate() {
        return imid_mrb_pmcdate;
    }

    public void setImid_mrb_pmcdate(Date imid_mrb_pmcdate) {
        this.imid_mrb_pmcdate = imid_mrb_pmcdate;
    }

    public String getImid_mrb_apprusr() {
        return imid_mrb_apprusr;
    }

    public void setImid_mrb_apprusr(String imid_mrb_apprusr) {
        this.imid_mrb_apprusr = imid_mrb_apprusr;
    }

    public Date getImid_mrb_apprdate() {
        return imid_mrb_apprdate;
    }

    public void setImid_mrb_apprdate(Date imid_mrb_apprdate) {
        this.imid_mrb_apprdate = imid_mrb_apprdate;
    }

    public Double getImid_mrb_labor() {
        return imid_mrb_labor;
    }

    public void setImid_mrb_labor(Double imid_mrb_labor) {
        this.imid_mrb_labor = imid_mrb_labor;
    }

    public String getImid_mrb_vend() {
        return imid_mrb_vend;
    }

    public void setImid_mrb_vend(String imid_mrb_vend) {
        this.imid_mrb_vend = imid_mrb_vend;
    }

    public Double getImid_mrb_vlabor() {
        return imid_mrb_vlabor;
    }

    public void setImid_mrb_vlabor(Double imid_mrb_vlabor) {
        this.imid_mrb_vlabor = imid_mrb_vlabor;
    }

    public Double getImid_mrb_uai() {
        return imid_mrb_uai;
    }

    public void setImid_mrb_uai(Double imid_mrb_uai) {
        this.imid_mrb_uai = imid_mrb_uai;
    }

    public Double getImid_mrb_rtv() {
        return imid_mrb_rtv;
    }

    public void setImid_mrb_rtv(Double imid_mrb_rtv) {
        this.imid_mrb_rtv = imid_mrb_rtv;
    }

    public String getImid_mrb_follow() {
        return imid_mrb_follow;
    }

    public void setImid_mrb_follow(String imid_mrb_follow) {
        this.imid_mrb_follow = imid_mrb_follow;
    }

    public String getImid_mrb_fnbr() {
        return imid_mrb_fnbr;
    }

    public void setImid_mrb_fnbr(String imid_mrb_fnbr) {
        this.imid_mrb_fnbr = imid_mrb_fnbr;
    }

    public String getImid_appr_status() {
        return imid_appr_status;
    }

    public void setImid_appr_status(String imid_appr_status) {
        this.imid_appr_status = imid_appr_status;
    }

    public Date getImid_insp_date() {
        return imid_insp_date;
    }

    public void setImid_insp_date(Date imid_insp_date) {
        this.imid_insp_date = imid_insp_date;
    }

    public String getImid_insp_usr() {
        return imid_insp_usr;
    }

    public void setImid_insp_usr(String imid_insp_usr) {
        this.imid_insp_usr = imid_insp_usr;
    }

    public Date getImid_check_date() {
        return imid_check_date;
    }

    public void setImid_check_date(Date imid_check_date) {
        this.imid_check_date = imid_check_date;
    }

    public String getImid_check_usr() {
        return imid_check_usr;
    }

    public void setImid_check_usr(String imid_check_usr) {
        this.imid_check_usr = imid_check_usr;
    }

    public Date getImid_verify_date() {
        return imid_verify_date;
    }

    public void setImid_verify_date(Date imid_verify_date) {
        this.imid_verify_date = imid_verify_date;
    }

    public String getImid_verify_usr() {
        return imid_verify_usr;
    }

    public void setImid_verify_usr(String imid_verify_usr) {
        this.imid_verify_usr = imid_verify_usr;
    }

    public String getImid_hrisk_nbr() {
        return imid_hrisk_nbr;
    }

    public void setImid_hrisk_nbr(String imid_hrisk_nbr) {
        this.imid_hrisk_nbr = imid_hrisk_nbr;
    }

    public String getImid_coc_nbr() {
        return imid_coc_nbr;
    }

    public void setImid_coc_nbr(String imid_coc_nbr) {
        this.imid_coc_nbr = imid_coc_nbr;
    }

    public Date getImid_mod_date() {
        return imid_mod_date;
    }

    public void setImid_mod_date(Date imid_mod_date) {
        this.imid_mod_date = imid_mod_date;
    }

    public String getImid_mod_usr() {
        return imid_mod_usr;
    }

    public void setImid_mod_usr(String imid_mod_usr) {
        this.imid_mod_usr = imid_mod_usr;
    }

    public String getImid_is_sync_epicor() {
        return imid_is_sync_epicor;
    }

    public void setImid_is_sync_epicor(String imid_is_sync_epicor) {
        this.imid_is_sync_epicor = imid_is_sync_epicor;
    }
}
