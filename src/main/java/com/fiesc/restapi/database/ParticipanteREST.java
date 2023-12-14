package com.fiesc.restapi.database;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fiesc.restapi.database.RepositorioParticipante;
import com.fiesc.restapi.entidade.Participante;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Definiremos aqui o servidor REST que tem a interface desacoplada
// Assim, idependente da tecnologia ou plataforma utilizada, pode ser web, desktop, mobile, etc.
// Solicita umas das operações básicas no servidor REST (consulta, inserção, alteração e exclusão)

// Precisamos de um objeto que tenha as operações para manipular o Participante no banco de dados, nesse caso, o repositório de Participantes (RepositorioParticipante.java)
// Em tempo de execução, o Spring injeta a biblioteca genérica especifica para Participante, fornecendo as operações básicas para manipular o Participante no banco de dados.

@RestController // Associar a uma url, vincular os metodos aos protocolos http. Define uue a classe é um REST
@RequestMapping(value = "/participante") // Vincular uma url
public class ParticipanteREST {
    // Aqui, ao invés de criar o objeto manualmente, iremos delegar essa tarefa ao Sring, através da injeção de dependência
    // Dessa forma, o Spring cria o objeto e injeta aqui no atributo e cuida dele, gerenciando seu cilclo de vida, fica muito mais fácil.
    // Temos um objeto que tem todas as operações basicas para manipular o Participante em banco de dados, podemos definir aqui os métodos (salvar, alterar, excluir e consultar)
    // Definir atributo:
    @Autowired
    private RepositorioParticipante repositorio;
        
    /*
    @GetMapping
    public List<Participante>listar(){
        return repositorio.findAll();
    }
     */
    
   /*
     @GetMapping(value = "/{id}")
    public List<Participante> findById(@RequestBody Participante participante) {
        return repositorio.findAll();
    }
    */
   
    // @RequestBody converte json para objeto java

    @PostMapping
    public void salvar(@RequestBody Participante participante){
        repositorio.save(participante);
    }

    @PutMapping(value = "/{id}")
    public void alterar(@RequestBody Participante participante){
        if(participante.getId() > 0) {
            repositorio.save(participante);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Participante participante){
        if(participante.getId() > 0) {
            repositorio.delete(participante);
        }
    }
}
