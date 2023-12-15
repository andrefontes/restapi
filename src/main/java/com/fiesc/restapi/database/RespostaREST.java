package com.fiesc.restapi.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.entidade.Resposta;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController 
@RequestMapping(value = "/resposta") 
public class RespostaREST {

    @Autowired
    private RepositorioResposta repositorio;
        
    
    @GetMapping
    public List<Resposta>listar(){
        return repositorio.findAll();
    }
    
    
    @GetMapping(value = "/{id}")
    public List<Resposta> findById(@RequestBody Resposta resposta) {
        return repositorio.findAll();
    }
    
   
    // @RequestBody converte json para objeto java

    @PostMapping
    public void salvar(@RequestBody Resposta resposta){
        repositorio.save(resposta);
    }

    @PutMapping
    public void alterar(@RequestBody Resposta resposta){
        //if(resposta.getId() > 0) {
            repositorio.save(resposta);
        //}
    }

    @DeleteMapping
    public void excluir(@RequestBody Resposta resposta){
        if(resposta.getId() > 0) {
            repositorio.delete(resposta);
        }
    }
}
