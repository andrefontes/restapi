package com.fiesc.restapi.database;

import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
//@RequestMapping("/api/v1/participante-resposta")
public class ParticipanteRespostaREST {

    @Autowired
    private RepositorioParticipante repositorioParticipante;

    @Autowired
    private RepositorioResposta repositorioResposta;

    //@Autowired
    //private RepositorioParticipanteResposta repositorioParticipanteResposta;


    @RequestMapping(value = "/api/v1/participante-hello", method = RequestMethod.GET)
    @GetMapping
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/v1/participante-teste", method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<Participante>> teste() {
        List<Participante> r = new ArrayList<>();
        return ResponseEntity.ok(r);
    }


    @RequestMapping("/api/v1/participante-cadastrar")
    @GetMapping
    //@ResponseBody
    //public List<Participante>listar(){
    //public ResponseEntity<Participante> listar() {
    public ResponseEntity<List<Participante>> listar() {
        List<Participante> r = repositorioParticipante.findAll();
        return ResponseEntity.ok(r);
        //return r;//repositorioParticipante.findAll();
        //return repositorioParticipante.findAll();
        //return null;
        //return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @RequestMapping("/api/v1/participante-listar-id")
    @GetMapping(value = "/{id}")
    public List<Participante>findById(@RequestBody Participante participante){
        return repositorioParticipante.findAll();
    }


    @RequestMapping("/api/v1/salvar-participante-por-participante-resposta-1")
    @PostMapping
    public ResponseEntity<Participante> salvarParticipantePostParticipanteResposta1(@RequestBody Participante participante) {
        repositorioParticipante.save(participante);       
   
        for (Resposta resposta : participante.getResposta()) {
            resposta.setParticipante(participante);
            resposta.setPontuacao_total_ansiedade(22);
            resposta.setPontuacao_total_depressao(20);
            //resposta.setPontuacao_total_estresse(30);
            repositorioResposta.save(resposta);
        }

        //return ResponseEntity.ok(participante);
        return ResponseEntity.ok().body(participante);
        //return ResponseEntity.ok().build();
    }

    @RequestMapping("/api/v1/salvar-participante-por-participante-resposta-2")
    @PostMapping
    public ResponseEntity<Participante> salvarParticipantePostParticipanteResposta2(@RequestBody Participante participante) {         
        repositorioParticipante.save(participante);

        for (Resposta resposta : participante.getResposta()) {
            resposta.setParticipante(participante);
            repositorioResposta.save(resposta);
        }
        return ResponseEntity.ok(participante);
    }


    @RequestMapping("/api/v1/salvar-resposta-por-participante-resposta-1")
    @PostMapping
    public ResponseEntity<Resposta> salvarRespostaPostParticipanteResposta1(@RequestBody Resposta respostas) {
        
        /*
        for (Resposta resposta : respostas.getParticipante()) {
            //resposta.setParticipante(participante);
            repositorioResposta.save(resposta);
        }
        */
        return ResponseEntity.ok(respostas);
    }
}