package com.fiesc.restapi.entidade;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity //Esta notação define que essa classe será uma entidade, cria automaticamente uma tabela que representa essa entidade no banco de dados
public class Participante {
    //Toda entidade precisa de um identificador
    // Quero que esse ID seja gerado automaticamente. 
    // Há varias formas de gerar valosres automaticamente, então precisamos definir uma estratégia. 
    // Autoincremento porque estamos usando o mycircle
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    // Podemos adicionar regras de colunas, assim, lá no banco de dados será criada uma constraints em que o cmapo não pode ser nulo.
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "idade", nullable = false) 
    private Integer idade;
    
    @Column(name = "genero", nullable = false, length = 20) 
    private String genero;

    @Column(name = "telefone", length = 70) 
    private String telefone;
    
    @Column(name = "email", length = 100) 
    private String email;
    
    @Column(name = "urlAvatar") 
    private String urlAvatar;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "participante")
    private List<Resposta> resposta;


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


    public List<Resposta> getResposta() {
        return resposta;
    }


    public void setResposta(List<Resposta> resposta) {
        this.resposta = resposta;
    }


    
}

