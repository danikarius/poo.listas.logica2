package com.poo.lista2;


import java.util.Scanner;

public class Exercicio2 {

    /*2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
         pelo usuário e diga qual deles é maior.*/

            public static void resolucao() {
                
                Scanner leia = new Scanner(System.in);
        
                double num1, num2;
        
                System.out.print("Digite o primeiro número: ");
                num1 = leia.nextDouble();
        
                System.out.print("Digite o segundo número: ");
                num2 = leia.nextDouble();
        
                if (num1 > num2) {
                    System.out.println("O primeiro número é maior do que o segundo.");
                } else {
                    System.out.println("O segundo número é maior do que o primeiro.");
                }
        
        }
    }

        

        
