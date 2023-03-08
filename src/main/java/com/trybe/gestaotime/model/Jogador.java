package com.trybe.gestaotime.model;

/**
 * Classe Jogador.
 **/

public class Jogador {

  private Long id;

  private String nome;
  private String posicao;
  private int documento;
  private String time;

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

  public int getDocumento() {
    return documento;
  }

  public void setDocumento(int documento) {
    this.documento = documento;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Long getId() {
    return id;
  }

}
