package com.fiesc.restapi.database;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;


/* 
public SomeData requestMethodName(@RequestParam String param) {
    return new SomeData();
}
*/



@RestController
@RequestMapping("/api/v1/usuario")
public class ClienteREST {

    @Autowired
    private RepositorioParticipante repositorioParticipante;

    @Autowired
    private RepositorioResposta repositorioResposta;


    @PostMapping
    //public static void main(String[] args) {
    public ResponseEntity<Participante> salvar(@RequestBody Participante participante) {
        //Participante participante = new Participante();
        participante.setNome("Participante4");
        participante.setIdade(null);
        participante.setGenero(null);
        participante.setTelefone(null);
        participante.setEmail(null);
        participante.setUrlAvatar(null);


        Resposta resposta = new Resposta();
        resposta.setParticipante(participante);;
        resposta.setPontuacao_total_ansiedade(null);
        resposta.setPontuacao_total_depressao(null);
        resposta.setPontuacao_total_estresse(null);

        ObjectMapper mapper = new ObjectMapper();
        //String json = mapper.writeValueAsString(participante);


        

        //System.out.println(json);


        //participante.getRespostas().add(resposta1);
        
        return ResponseEntity.ok(participante);
    }
}