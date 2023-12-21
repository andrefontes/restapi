package com.fiesc.restapi.api.v1.Consultas;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiesc.restapi.database.RepositorioParticipante;
import com.fiesc.restapi.database.RepositorioResposta;
import com.fiesc.restapi.entidade.Participante;
import com.fiesc.restapi.entidade.Resposta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/v1/consultas")
public class Consultas {


private final RepositorioParticipante repositorioParticipante;
private final RepositorioResposta repositorioResposta;


public Consultas(RepositorioParticipante repositorioParticipante, RepositorioResposta repositorioResposta) {
    this.repositorioParticipante = repositorioParticipante;
    this.repositorioResposta = repositorioResposta;
}

@GetMapping("/participantes")
public ResponseEntity<List<Participante>> listarParticipantes() {
    List<Participante> participantes = repositorioParticipante.findAll();
    return ResponseEntity.ok(participantes);
}

@GetMapping("/respostas")
public ResponseEntity<List<Resposta>> listarRespostas() {
    List<Resposta> respostas = repositorioResposta.findAll();
    return ResponseEntity.ok(respostas);
}


/*

public ResponseEntity<Participante> buscarParticipantePorId(Long id) {
Participante participante = repositorioParticipante.findById(id).orElse(null);
if (participante == null) {
return ResponseEntity.notFound().build();
}
return ResponseEntity.ok(participante);
}

public ResponseEntity<List<Resposta>> listarRespostas() {
List<Resposta> respostas = repositorioResposta.findAll();
return ResponseEntity.ok(respostas);
}

public ResponseEntity<Resposta> buscarRespostaPorId(Longa id) {
Resposta resposta = repositorioResposta.findById(id).orElse(null);
if (resposta == null) {
return ResponseEntity.notFound().build();
}
return ResponseEntity.ok(resposta);
}

public ResponseEntity<List<Resposta>> listarRespostasPorParticipante(Long idParticipante) {
List<Resposta> respostas = repositorioResposta.findAllByParticipanteId(idParticipante);
return ResponseEntity.ok(respostas);
}
 */
}