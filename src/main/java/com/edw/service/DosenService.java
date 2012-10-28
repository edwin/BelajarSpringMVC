/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edw.service;

import com.edw.bean.Dosen;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author edwin
 */
@Service("dosenService")
@Transactional
public class DosenService {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Dosen> getDosens() {
        return sessionFactory.getCurrentSession().createCriteria(Dosen.class).list();
    }
    
    public void save(Dosen dosen) {
        sessionFactory.getCurrentSession().save(dosen);
    }
    
    public Dosen get(String kodedosen) {
        return (Dosen)sessionFactory.getCurrentSession().get(Dosen.class, kodedosen);
    }
}
