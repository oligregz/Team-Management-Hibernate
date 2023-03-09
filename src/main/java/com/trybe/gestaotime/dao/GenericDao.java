package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudHibernatePU");
  
  abstract void save(T s);

  abstract void update(T s);

  abstract void delete(I id);

  abstract List<T> list();

  abstract T findById(I id);
}
