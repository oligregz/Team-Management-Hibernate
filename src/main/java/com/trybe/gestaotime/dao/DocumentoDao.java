package com.trybe.gestaotime.dao;

import java.util.List;

import com.trybe.gestaotime.model.Documento;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


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
  Documento findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Documento document = em.find(Documento.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
    return document;
  }

  @Override
  List<Documento> list() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Documento> cq = cb.createQuery(Documento.class);
    Root<Documento> rootEntry = cq.from(Documento.class);
    CriteriaQuery<Documento> all = cq.select(rootEntry);
    TypedQuery<Documento> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  void update(Documento s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  void delete(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Documento document = em.find(Documento.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
  }
}
