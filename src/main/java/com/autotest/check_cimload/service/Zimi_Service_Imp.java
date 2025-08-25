package com.autotest.check_cimload.service;


import com.autotest.check_cimload.model.ZimiMstrId;
import com.autotest.check_cimload.model.Zimi_Mstr;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Zimi_Service_Imp implements Zimi_Service {

    private SessionFactory sessionFactory;
    String select = "select new com.autotest.check_cimload.model.Zimi_Mstr(zimi.id.zIMI_Id,zimi.zIMI_Decision, " +
            "zimi.zIMI_Part,zimi.zIMI_Sample,zimi.zIMI_Insp,zimi.id.zIMI_Site,zimi.zIMI_Vendor,zimi.zIMI_Rcpdate,zimi.zIMI_Buyer) from com.autotest.check_cimload.model.Zimi_Mstr zimi";

    public Zimi_Service_Imp() {
        try {
            this.sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Zimi_Mstr> getZimiList() {
       try (Session session = sessionFactory.openSession()){

           return session.createQuery(select, Zimi_Mstr.class).list();
       }catch (Exception e) {
           e.printStackTrace();
           return java.util.Collections.emptyList();
       }
    }



}
