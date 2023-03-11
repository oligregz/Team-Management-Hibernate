package com.trybe.gestaotime.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Classe Torcedor.
 **/
@Entity
@Table(name = "tb_torcedor")
public class Torcedor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "torcedores")
  private List<Time> times;

  public Torcedor() {
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Time> getTimes() {
    return times;
  }

  public void setTime(Time time) {
    this.times.add(time);
  }
  
}
