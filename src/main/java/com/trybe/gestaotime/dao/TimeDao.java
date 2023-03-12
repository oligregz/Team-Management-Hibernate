package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TimeDao extends GenericDao<Time, Integer> {

  @Override
  public void salvar(Time s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public Time findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Time team = em.find(Time.class, id);
    em.remove(team);
    em.getTransaction().commit();
    em.close();
    return team;
  }

  @Override
  public List<Time> listar() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Time> cq = cb.createQuery(Time.class);
    Root<Time> rootEntry = cq.from(Time.class);
    CriteriaQuery<Time> all = cq.select(rootEntry);
    TypedQuery<Time> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  public void update(Time s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void deletar(Long id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Time team = em.find(Time.class, id);
    em.remove(team);
    em.getTransaction().commit();
    em.close();
  }

}
