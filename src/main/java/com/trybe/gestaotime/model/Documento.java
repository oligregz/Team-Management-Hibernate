package com.trybe.gestaotime.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe Documento.
 */
@Entity
@Table(name = "tb_documento")
public class Documento {
  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
  private Integer id;

  private String cpf;

  private String numeroCarteiraTrabalho;

  private String numeroCbf;

  @OneToOne(mappedBy = "documento", cascade = CascadeType.ALL,
      orphanRemoval = true, fetch = FetchType.LAZY)
  private Jogador jogador;

  public Integer getId() {
    return id;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }
  
  public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }
  
  public String getNumeroCbf() {
    return numeroCbf;
  }
  
  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }

}
