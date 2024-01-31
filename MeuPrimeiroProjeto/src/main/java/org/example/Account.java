package org.example;

public class Account {
    private static final int MAX_LENGTH = 12;
    private String ag;
    private String cc;
    private String name;
    private double balance;
    private Log logger;
    
    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        this.name = name;
        logger = new Log();
    }
   
    public String getAg() {
        return ag;
    }
    
    public void setAg(String ag) {
        this.ag = ag;
    }
    
    public String getCc() {
        return cc;
    }
    
    public void setCc(String cc) {
        this.cc = cc;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name.length() > MAX_LENGTH){
        this.name = name.substring(0,MAX_LENGTH);
    }else{
            this.name=name;
        }
    }
    public void deposit(double value){
        balance += value;
        logger.out("Depósito: O saldo atual da conta é de " + balance);
    }
    
    public boolean withdraw(double value) {
        if (balance < value) {
            logger.out(" O saldo atual da sua conta é " + balance);
            return false;
        } else {
            balance -= value;
            logger.out("Saque : O saldo atual da conta é de " + balance);
            return true;
        }
    }
    
    @Override
    public String toString() {
        return "Account{" +
                "ag='" + this.ag + '\'' +
                ", cc='" + this.cc + '\'' +
                ", name='" + this.name + '\'' +
                ", balance=" + this.balance +
                '}';
    }
}
