package com.fiesc.restapi.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.entidade.Contato;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

// Definiremos aqui o servidor REST que tem a interface desacoplada
// Assim, idependente da tecnologia ou plataforma utilizada, pode ser web, desktop, mobile, etc.
// Solicita umas das operações básicas no servidor REST (consulta, inserção, alteração e exclusão)

// Precisamos de um objeto que tenha as operações para manipular o contato no banco de dados, nesse caso, o repositório de Contatos (RepositorioContato.java)
// Em tempo de execução, o Spring injeta a biblioteca genérica especifica para Contato, fornecendo as operações básicas para manipular o contato no banco de dados.

@RestController // Associar a uma url, vincular os metodos aos protocolos http. Define uue a classe é um REST
@RequestMapping(value = "/contato") // Vincular uma url
public class ContatoREST {
    // Aqui, ao invés de criar o objeto manualmente, iremos delegar essa tarefa ao Sring, através da injeção de dependência
    // Dessa forma, o Spring cria o objeto e injeta aqui no atributo e cuida dele, gerenciando seu ciclo de vida, fica muito mais fácil.
    // Temos um objeto que tem todas as operações basicas para manipular o contato em banco de dados, podemos definir aqui os métodos (salvar, alterar, excluir e consultar)
    // Definir atributo:
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<Contato>listar(){
        return repositorio.findAll();
    }

    @GetMapping(value = "/{id}")
    public List<Contato> findById(@RequestBody Contato contato) {
        return repositorio.findAll();
    }
  
    // @RequestBody converte json para objeto java

    @PostMapping
    public void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }

    @PutMapping(value = "/{id}")
    public void alterar(@RequestBody Contato contato){
        if(contato.getId() > 0) {
            repositorio.save(contato);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato){
        if(contato.getId() > 0) {
            repositorio.delete(contato);
        }
    }
}
