package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class TorcedorDao extends GenericDao<Torcedor, Integer> {

  @Override
  void save(Torcedor s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  Torcedor findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Torcedor document = em.find(Torcedor.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
    return document;
  }

  @Override
  List<Torcedor> list() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Torcedor> cq = cb.createQuery(Torcedor.class);
    Root<Torcedor> rootEntry = cq.from(Torcedor.class);
    CriteriaQuery<Torcedor> all = cq.select(rootEntry);
    TypedQuery<Torcedor> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  void update(Torcedor s) {
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
    Torcedor document = em.find(Torcedor.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
  }

}
