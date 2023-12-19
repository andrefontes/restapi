package com.fiesc.restapi.database;

import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;
//import com.fiesc.restapi.entidade.ParticipanteResposta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/participante-resposta")
public class ParticipanteRespostaREST {

    @Autowired
    private RepositorioParticipante repositorioParticipante;

    @Autowired
    private RepositorioResposta repositorioResposta;

    //@Autowired
    //private RepositorioParticipanteResposta repositorioParticipanteResposta;

    @GetMapping
    @ResponseBody
    public List<Participante>listar(){
        return repositorioParticipante.findAll();
    }


    
    @PostMapping
    public ResponseEntity<Participante> salvar(@RequestBody Participante participante) {

        repositorioParticipante.save(participante);       
                
        
        //participante.getResposta();
        
        Resposta resposta = new Resposta();
        resposta.setPontuacao_total_ansiedade(10);
        resposta.setPontuacao_total_depressao(20);
        resposta.setPontuacao_total_estresse(30);
        resposta.setParticipante(participante);
        repositorioResposta.save(resposta);

        

        return ResponseEntity.ok(participante);
        //return ResponseEntity.ok().build();
    }
}