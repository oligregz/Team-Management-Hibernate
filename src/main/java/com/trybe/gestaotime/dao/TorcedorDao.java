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
  public void salvar(Torcedor s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public Torcedor findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Torcedor document = em.find(Torcedor.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
    return document;
  }

  @Override
  public List<Torcedor> listar() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Torcedor> cq = cb.createQuery(Torcedor.class);
    Root<Torcedor> rootEntry = cq.from(Torcedor.class);
    CriteriaQuery<Torcedor> all = cq.select(rootEntry);
    TypedQuery<Torcedor> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  public void update(Torcedor s) {
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
    Torcedor document = em.find(Torcedor.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
  }

}
