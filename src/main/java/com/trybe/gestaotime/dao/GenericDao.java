package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudHibernatePU");
  
  abstract void salvar(T s);

  abstract void editar(T s);

  abstract void deletar(Long id);

  abstract List<T> listar();

  abstract T findById(I id);
}
