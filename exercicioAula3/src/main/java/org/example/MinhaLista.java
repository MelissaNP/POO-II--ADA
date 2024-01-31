package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends U> {
    private List<T> elementos;
    
    public MinhaLista() {
        this.elementos = new ArrayList<>();
    }
    
    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }
    
    public T obter(Long indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice.intValue());
        } else {
            return null;
        }
    }
    public boolean contem(T elemento) {
        return elementos.contains(elemento);
    }
    
    public int indice(Long id) {
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}


