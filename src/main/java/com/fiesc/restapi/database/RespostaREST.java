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

@RestController // Associar a uma url, vincular os metodos aos protocolos http. Define uue a classe é um REST
@RequestMapping(value = "/resposta") // Vincular uma url
public class RespostaREST {
    // Aqui, ao invés de criar o objeto manualmente, iremos delegar essa tarefa ao Sring, através da injeção de dependência
    // Dessa forma, o Spring cria o objeto e injeta aqui no atributo e cuida dele, gerenciando seu cilclo de vida, fica muito mais fácil.
    // Temos um objeto que tem todas as operações basicas para manipular o Resposta em banco de dados, podemos definir aqui os métodos (salvar, alterar, excluir e consultar)
    // Definir atributo:
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
