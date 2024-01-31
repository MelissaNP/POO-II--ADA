package org.example;

import java.util.ArrayList;
import java.util.List;

class StackImpl<T> implements Stack<T> {
    private List<T> elementos;
    
    
    public StackImpl(){
        this.elementos = new ArrayList<>();
    }
    
    @Override
    public void push(T elemento) {
        elementos.add(elemento);
    }
    
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível desempilhar.");
        }
        return elementos.remove(elementos.size() - 1);
    }
    
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não há elementos no topo.");
        }
        return elementos.get(elementos.size() - 1);
    }
    
    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
