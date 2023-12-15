package com.fiesc.restapi.database;

import com.fiesc.restapi.entidade.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Fazer herança do JPA
// Precisamos definir 2 tipos: tipo da entidade (Contato) e o tio do identificador (Long)
// Spring tem uma bliblioteca de repostórios genéricos que faz o crud basico, consulta , inserção e exclusao de qualquer tabela
// Para isso funcionar, precisa saber de qual tabela se trata, pois ele nao adivinha as coisas.
// Nesse caso, as operações são para Contato, tipo identificado Contato. 
// Fornece os principais métodos para manipular o Contato no banco de dados.
// Utilize dentro do método, com o teclado (. + <espaço>).

@Repository
public interface RepositorioContato extends JpaRepository<Contato,Long>{
     
}
