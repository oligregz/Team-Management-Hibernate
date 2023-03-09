package com.trybe.gestaotime.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.trybe.gestaotime.model.Time;

public class TimeDao extends GenericDao<Time, Integer> {

  @Override
  void save(Time s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  Time findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Time team = em.find(Time.class, id);
    em.remove(team);
    em.getTransaction().commit();
    em.close();
    return team;
  }

  @Override
  List<Time> list() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Time> cq = cb.createQuery(Time.class);
    Root<Time> rootEntry = cq.from(Time.class);
    CriteriaQuery<Time> all = cq.select(rootEntry);
    TypedQuery<Time> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  void update(Time s) {
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
    Time team = em.find(Time.class, id);
    em.remove(team);
    em.getTransaction().commit();
    em.close();
  }

}
