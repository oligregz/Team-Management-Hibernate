package com.trybe.gestaotime.model;

/**
 * Classe Documento.
 */

public class Documento {

  private Long id;

  private int cpf;
  private int numeroCarteiraTrabalho;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getCpf() {
    return cpf;
  }

  public void setCpf(int cpf) {
    this.cpf = cpf;
  }

  public int getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(int numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }

}
