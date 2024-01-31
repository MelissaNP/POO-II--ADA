package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static void main(String[] args) {
        Stack<Integer> pilha = new StackImpl<>();
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        
        System.out.println("Elemento do topo: " + pilha.peek()); // Deve imprimir 3
        System.out.println("Desempilhando: " + pilha.pop()); // Deve imprimir 3
        System.out.println("Elemento do topo após desempilhar: " + pilha.peek()); // Deve imprimir 2
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // Deve imprimir false
    }
}