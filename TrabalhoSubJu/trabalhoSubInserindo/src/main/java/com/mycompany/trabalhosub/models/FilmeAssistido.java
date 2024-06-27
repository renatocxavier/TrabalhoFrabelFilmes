
package com.mycompany.trabalhosub.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




public class FilmeAssistido {
    
  
    private int id;
    
 
    private String nome;

    public FilmeAssistido() {
    }

    public FilmeAssistido(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FilmeAssistido{" + "id=" + id + ", nome=" + nome + '}';
    }




    
    
}
