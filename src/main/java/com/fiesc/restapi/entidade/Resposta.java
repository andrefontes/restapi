package com.fiesc.restapi.entidade;

import java.security.Timestamp;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity 
public class Resposta {

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(name = "data_resposta", nullable = false)
    private Timestamp data_resposta;

    @Column(name = "pontuacao_total_depressao", nullable = false)
    private Integer pontuacao_total_depressao;

    @Column(name = "pontuacao_total_ansiedade", nullable = false)
    private Integer pontuacao_total_ansiedade;

    @Column(name = "pontuacao_total_estresse", nullable = false)
    private Integer pontuacao_total_estresse;
    
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "idade", nullable = false) 
    private Integer idade;
    
    @Column(name = "genero", nullable = false, length = 20) 
    private String genero;

    @Column(name = "telefone", length = 30) 
    private String telefone;
    
    @Column(name = "email", length = 100) 
    private String email;
    
    @Column(name = "urlAvatar") 
    private String urlAvatar;

    @Column(name = "participante_id", nullable = false)
    // @ForeignKey(foreignKeyDefinition = "FOREIGN KEY (participante_id) REFERENCES participante(id)", name = "fk_resposta_participante" )
    // @OnDelete(action = OnDeleteAction.CASCADE)
    private Long participanteId;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    
}

