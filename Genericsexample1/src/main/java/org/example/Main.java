package org.example;

public class Main {
    public static void main(String[] args) {
        
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "GENERICS");
        
        tgObj.showTypes();
        
        int v = tgObj.getOb1();
        System.out.println("value: " + v);
        
        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}