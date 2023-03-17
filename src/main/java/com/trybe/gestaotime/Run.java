package com.trybe.gestaotime;

import com.trybe.gestaotime.dao.JogadorDao;
import com.trybe.gestaotime.model.Jogador;
import com.trybe.gestaotime.model.Time;

/**
 * Classe Run.
 */

public class Run {
  /**
   * Essa classe serve para manipulação no banco de dados através
   * dos metodos de cada model.
   */
  public static void main(String[] args) {

    Time t1 = new Time();
    t1.setNome("Taitinga");

    Jogador j1 = new Jogador();
    j1.setNome("Jailson Pé de Foice");
    j1.setPosicao("Ponta de Lança");
    j1.setTime(t1);

    JogadorDao jd = new JogadorDao();
    jd.deletar(2);
  }

}
