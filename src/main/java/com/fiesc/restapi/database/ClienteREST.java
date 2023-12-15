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
@RequestMapping("/api/v1/usuario")
public class ClienteREST {

    @Autowired
    private RepositorioParticipante repositorioParticipante;

    @Autowired
    private RepositorioResposta repositorioResposta;


    
    @PostMapping
    //public static void main(String[] args) {
    public ResponseEntity<Resposta> salvar(@RequestBody Resposta resposta) {

    
    //public ResponseEntity<Object[]> salvar(@RequestBody List<Object> dataList) {
    //public ResponseEntity<Object[]> salvar(@RequestBody String data) throws JsonProcessingException {
    //public void salvar(Participante participante, Resposta resposta) {
    //public ResponseEntity<Participante> salvar(@RequestBody Participante participante, @RequestBody Resposta resposta) {

        //Object[] dataArray = dataList.toArray();
        //ObjectMapper mapper = new ObjectMapper();
        //Object[] dataArray = mapper.readValue(data, Object[].class);
        //return ResponseEntity.ok(dataArray);
        
        

        //Participante participante = new Participante();
        
        /*
        participante.setNome("Participante4");
        participante.setIdade(null);
        participante.setGenero(null);
        participante.setTelefone(null);
        participante.setEmail(null);
        participante.setUrlAvatar(null);
        */
        

        //repositorioParticipante.save(participante);
        //repositorioResposta.save(resposta);
        //repositorioResposta.setParticipante(participante);

        //Resposta resposta = new Resposta();
        //resposta.saveParticipante(participante);


        resposta.setParticipante(resposta.getParticipante());
        repositorioResposta.save(resposta);
        

        /*

        Resposta resposta = new Resposta();
        resposta.setParticipante(participante);;
        resposta.setPontuacao_total_ansiedade(null);
        resposta.setPontuacao_total_depressao(null);
        resposta.setPontuacao_total_estresse(null);

        //repositorioResposta.save(resposta);

        ObjectMapper mapper = new ObjectMapper();
        //String json = mapper.writeValueAsString(participante);

        //System.out.println(json);

        Object obj1 = mapper.convertValue(participante, Object.class);
        Object obj2 = mapper.convertValue(resposta, Object.class);

        
        return ResponseEntity.ok(participante);
        
*/   
        return ResponseEntity.ok(resposta);
    
    }
}