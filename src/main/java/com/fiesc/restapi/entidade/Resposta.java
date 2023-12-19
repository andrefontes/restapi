package com.fiesc.restapi.entidade;

import java.security.Timestamp;
import java.sql.Date;
import java.util.HashSet;
import java.util.Locale.Category;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;




@Entity 
public class Resposta {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id") 
    private Long id;

    //@Basic(optional = false)
    //@Column(name = "data_resposta", insertable = true, updatable = true)    
    //@Temporal(TemporalType.TIMESTAMP)
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@CreationTimestamp
    //@Column(name = "data_resposta", insertable = true, updatable = true)
    //private Timestamp data_resposta;
    @Column(name = "data_resposta") 
    private String data_resposta;


    @Column(name = "pontuacao_total_depressao", nullable = false) 
    private Integer pontuacao_total_depressao;

    @Column(name = "pontuacao_total_ansiedade", nullable = false) 
    private Integer pontuacao_total_ansiedade;

    @Column(name = "pontuacao_total_estresse", nullable = false) 
    private Integer pontuacao_total_estresse;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "participante_id")
    private Participante participante;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getData_resposta() {
        return data_resposta;
    }


    public void setData_resposta(String data_resposta) {
        this.data_resposta = data_resposta;
    }


    public Integer getPontuacao_total_depressao() {
        return pontuacao_total_depressao;
    }


    public void setPontuacao_total_depressao(Integer pontuacao_total_depressao) {
        this.pontuacao_total_depressao = pontuacao_total_depressao;
    }


    public Integer getPontuacao_total_ansiedade() {
        return pontuacao_total_ansiedade;
    }


    public void setPontuacao_total_ansiedade(Integer pontuacao_total_ansiedade) {
        this.pontuacao_total_ansiedade = pontuacao_total_ansiedade;
    }


    public Integer getPontuacao_total_estresse() {
        return pontuacao_total_estresse;
    }

    public void setPontuacao_total_estresse(Integer pontuacao_total_estresse) {
        this.pontuacao_total_estresse = pontuacao_total_estresse;
    }


    public Participante getParticipante() {
        return participante;
    }


    public void setParticipante(Participante participante) {
        this.participante = participante;
    }  

    
}

