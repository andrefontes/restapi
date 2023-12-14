package com.fiesc.restapi.entidade;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity //Esta notação define que essa classe será uma entidade, cria automaticamente uma tabela que representa essa entidade no banco de dados
public class Contato {
    //Toda entidade precisa de um identificador
    // Quero que esse ID seja gerado automaticamente. 
    // Há varias formas de gerar valosres automaticamente, então precisamos definir uma estratégia. 
    // Autoincremento porque estamos usando o mycircle
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    // Podemos adicionar regras de colunas, assim, lá no banco de dados será criada uma constraints em que o cmapo não pode ser nulo.
    @Column(nullable = false) 
    private String nome;
    @Column(nullable = false) 
    private String telefone;
    @Column(nullable = false) 
    private String email;
    @Column(nullable = false) 
    private String urlAvatar;

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

