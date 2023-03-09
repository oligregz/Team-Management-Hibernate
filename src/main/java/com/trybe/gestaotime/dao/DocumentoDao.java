package com.trybe.gestaotime.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.trybe.gestaotime.model.Documento;

public class DocumentoDao extends GenericDao<Documento, Integer> {

  @Override
  void save(Documento s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  void update(Documento s) {
    // TODO Auto-generated method stub
    
  }

  @Override
  void delete(Integer id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  Documento findById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  List<Documento> list() {
    // TODO Auto-generated method stub
    return null;
  }
}
