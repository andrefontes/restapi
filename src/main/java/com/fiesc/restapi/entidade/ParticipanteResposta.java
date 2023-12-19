package com.fiesc.restapi.entidade;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class ParticipanteResposta {

  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "participante_id")
  private Participante participante;

  private int pontuacao_total_ansiedade;

  private int pontuacao_total_depressao;

  private int pontuacao_total_estresse;

  // ...
}
