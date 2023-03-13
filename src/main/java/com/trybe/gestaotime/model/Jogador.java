package com.trybe.gestaotime.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe Jogador.
 **/
@Entity
@Table(name = "tb_jogador")
public class Jogador {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;
  
  private String posicao;

  @OneToOne
  @JoinColumn(name = "documento_id")
  private Documento documento;

  @ManyToOne
  @JoinColumn(name = "time_id")
  private Time time;

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPosicao() {
    return posicao;
  }

  public void setPosicao(String posicao) {
    this.posicao = posicao;
  }

  public Documento getDocumento() {
    return documento;
  }

  public void setDocumento(Documento documento) {
    this.documento = documento;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

}
