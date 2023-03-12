package com.trybe.gestaotime.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe Time.
 **/
@Entity
@Table(name = "tb_time")
public class Time {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @OneToMany(mappedBy = "time", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Jogador> jogadores;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(name = "relacionamento_time_torcedor",
      joinColumns = {@JoinColumn(name = "time_id") },
      inverseJoinColumns = {@JoinColumn(name = "torcedor_id")})
  private List<Torcedor> torcedores;

  /**
   * Constructor.
   */
  public Time() {
    super();
    this.jogadores = new ArrayList<Jogador>();
    this.torcedores = new ArrayList<Torcedor>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Jogador> getJogadores() {
    return jogadores;
  }

  public void setJogadores(List<Jogador> jogadores) {
    this.jogadores = jogadores;
  }

  public List<Torcedor> getTorcedores() {
    return torcedores;
  }

  public void setTorcedores(List<Torcedor> torcedores) {
    this.torcedores = torcedores;
  }

  public Long getId() {
    return id;
  }

}
