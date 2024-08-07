package com.mevy;

import java.util.Scanner;

import com.mevy.entities.Client;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Client client = new Client();
            
            System.out.println("Please enter the branch number!");
            client.setNumber(scanner.nextInt());
            System.out.println("Please enter the branch!");
            client.setBranch(scanner.next());
            System.out.println("Please enter your name!");
            client.setName(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Please enter your balance!");
            client.setBalance(scanner.nextFloat());
                        
            System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %f já está disponível para saque",
                client.getName(),
                client.getBranch(),
                client.getNumber(),
                client.getBalance()

            );
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}