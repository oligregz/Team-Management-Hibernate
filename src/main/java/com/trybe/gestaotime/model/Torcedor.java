package com.trybe.gestaotime.model;

/**
 * Classe Torcedor.
 **/

public class Torcedor {

  private Long id;

  private String name;

  private Time time;

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

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

  
}
