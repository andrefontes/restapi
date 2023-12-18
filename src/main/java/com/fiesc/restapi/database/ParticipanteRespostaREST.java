package com.fiesc.restapi.database;

import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/participante-resposta")
public class ParticipanteRespostaREST {

    @Autowired
    private RepositorioParticipante repositorioParticipante;

    @Autowired
    private RepositorioResposta repositorioResposta;


    
    @PostMapping
    public ResponseEntity<Participante> salvar(@RequestBody Participante participante) {

        repositorioParticipante.save(participante);
        Resposta resposta = new Resposta();
        resposta.setPontuacao_total_ansiedade(10);
        resposta.setPontuacao_total_depressao(20);
        resposta.setPontuacao_total_estresse(30);
        resposta.setParticipante(participante);
        repositorioResposta.save(resposta);

        return ResponseEntity.ok(participante);
    }
}