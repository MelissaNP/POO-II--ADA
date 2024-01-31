package org.example;

import java.util.Random;

public class Picker {
    private Object[] arrayParaEscolha;
    
public Picker(Object[] arrayParaEscolha) {
    this.arrayParaEscolha = arrayParaEscolha;
}

public Object[] getArrayParaEscolha() {
    return arrayParaEscolha;
}

public Object escolhe() {
    Random random = new Random();
    int numeroRandomico = random.nextInt(arrayParaEscolha.length);
    return arrayParaEscolha[numeroRandomico];
}
}
