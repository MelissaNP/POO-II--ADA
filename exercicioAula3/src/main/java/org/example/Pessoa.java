package org.example;

import java.util.List;

class Pessoa implements U {
    private Long id;
    private String nome;
    
    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    
    @Override
    public Long getId() {
        return id;
    }
//    }
   
    
    @Override
    public String toString() {
        return "Pessoa[id=" + id + ", nome=\"" + nome + "\"]";
    }
}

