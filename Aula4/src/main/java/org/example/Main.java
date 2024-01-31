package org.example;


public class Main {
    public static void main(String[] args) {
        String[] nomes = {"maria", "joana", "laura", "erica"};
        
        Object nomeEscolhido = new Picker(nomes).escolhe();
        System.out.println("Nome escolhido: " + nomeEscolhido);
    }
}