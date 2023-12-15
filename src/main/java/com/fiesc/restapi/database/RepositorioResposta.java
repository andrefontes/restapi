package com.fiesc.restapi.database;

import com.fiesc.restapi.entidade.Resposta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioResposta extends JpaRepository<Resposta,Long>{
    
}
