package org.example;

public interface Stack <T>{
    void push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
}


