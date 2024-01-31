package org.example;

class Pedido {
    private long id;
    private List<Item> itens;
    
    public Pedido(long id, List<Item> itens) {
        this.id = id;
        this.itens = itens;
    }
    
    // getters e setters
}
