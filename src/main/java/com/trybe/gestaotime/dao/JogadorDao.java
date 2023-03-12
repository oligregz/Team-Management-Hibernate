package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class JogadorDao extends GenericDao<Jogador, Integer> {

  @Override
  void save(Jogador s) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(s);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  Jogador findById(Integer id) {
    EntityManager em = GenericDao.emf.createEntityManager();
    em.getTransaction().begin();
    Jogador player = em.find(Jogador.class, id);
    em.remove(player);
    em.getTransaction().commit();
    em.close();
    return player;
  }

  @Override
  List<Jogador> list() {
    EntityManager em = GenericDao.emf.createEntityManager();
    
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Jogador> cq = cb.createQuery(Jogador.class);
    Root<Jogador> rootEntry = cq.from(Jogador.class);
    CriteriaQuery<Jogador> all = cq.select(rootEntry);
    TypedQuery<Jogador> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }

  @Override
  void update(Jogador s) {
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
    Jogador document = em.find(Jogador.class, id);
    em.remove(document);
    em.getTransaction().commit();
    em.close();
  }

}
