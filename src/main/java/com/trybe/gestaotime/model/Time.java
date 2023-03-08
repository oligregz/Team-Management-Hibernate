package com.trybe.gestaotime.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Time.
 **/

public class Time {

  private Long id;

  private String nome;
  private List<Jogador> jogadores;
  private List<Torcedor> torcedores;

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
