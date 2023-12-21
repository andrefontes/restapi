package com.fiesc.restapi.api.v1.Consultas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.database.RepositorioParticipante;
import com.fiesc.restapi.database.RepositorioResposta;
import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    @ResponseBody
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/v1/participante-teste", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Participante>> teste() {
        List<Participante> r = new ArrayList<>();
        return ResponseEntity.ok(r);
    }


    @RequestMapping("/api/v1/participante-cadastrar")
    @GetMapping
    @ResponseBody
    //public List<Participante>listar(){
    //public ResponseEntity<Participante> listar() {
    public ResponseEntity<List<Participante>> listar_aux() {
        List<Participante> r = repositorioParticipante.findAll();
        return ResponseEntity.ok(r);
        //return r;//repositorioParticipante.findAll();
        //return repositorioParticipante.findAll();
        //return null;
        //return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @RequestMapping("/api/v1/participante-listar")
    @GetMapping
    @ResponseBody
    public List<Participante>listar(){
        return repositorioParticipante.findAll();
    }


    @RequestMapping("/api/v1/salvar-participante-por-participante-resposta-1")
    @PostMapping
    @ResponseBody
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
    @ResponseBody
    public ResponseEntity<Participante> salvarParticipantePostParticipanteResposta2(@RequestBody Participante participante) {         
        repositorioParticipante.save(participante);

        for (Resposta resposta : participante.getResposta()) {
            resposta.setParticipante(participante);
            repositorioResposta.save(resposta);
        }
        return ResponseEntity.ok(participante);
    }

    @RequestMapping("/api/v1/salvar-participante-por-participante-resposta-3")
    @PostMapping
    @ResponseBody
    //public ResponseEntity<Participante> salvarParticipantePostParticipanteResposta2(@RequestBody Participante participante) {         
    public ResponseEntity<List<Resposta>> salvarParticipantePostParticipanteResposta3(@RequestBody Participante participante) {
        repositorioParticipante.save(participante);

        for (Resposta resposta : participante.getResposta()) {
            resposta.setParticipante(participante);
            repositorioResposta.save(resposta);
        }
        return ResponseEntity.ok(participante.getResposta());
    }

}