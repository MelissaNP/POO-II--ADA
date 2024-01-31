package org.example;

public class TwoGen<T,U> {
    T ob1;
    U ob2;
    
    public TwoGen(T ob1, U ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    void showTypes(){
        System.out.println("Type of T is "+ ob1.getClass().getName());
        System.out.println("Type of U is "+ ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    U getOb2(){
        return ob2;
    }
}
