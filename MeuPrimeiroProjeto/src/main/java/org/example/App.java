package org.example;

import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");
        
        while (true) {
            System.out.println("O que deseja fazer? C= criar conta, E= Sair do programa");
            String op = scanner.nextLine();
            
            if (op.equals("C")) {
                System.out.println("Digite seu nome:");
                String name = scanner.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);
                System.out.println(account);
                
                operateAccount(account);
            } else if (op.equals("E")) {
                break;
            }
        }
        
        List<Account> accountList = santander.getAccounts();
        System.out.println(accountList.toString());
    }
   
    static void operateAccount(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer ? D= deposito, S= Saque, E= Sair da conta");
            String op = scanner.nextLine();
            if (op.equals("D")) {
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
                String enter = scanner.nextLine();
            } else if (op.equals("S")) {
                System.out.println("Qual valor deseja sacar?");
                double value = scanner.nextDouble();
                if (!account.withdraw(value)) {
                    System.out.println("ops! não foi possível sacar o valor " + value);
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando inválido, tente novamente!");
            }
            scanner.nextLine();
        }
    }
}