package com.poo.lista2;
import java.util.Scanner;

public class Exercicio7 {

    /*7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
         um determinado número informado pelo usuário é divisível por X (Que também
        deve ser informado pelo usuário)*/

        public static void resolucao(){
            Scanner leia = new Scanner(System.in);

            int numero1, numero2;
    
            System.out.println("Digite o primeiro número: ");
            numero1 = leia.nextInt();
            
            System.out.println("Digite o segundo número: ");
            numero2 = leia.nextInt();
            if(numero1%numero2 == 0){
                System.out.println("O primeiro número informado é divisível pelo segundo número.");
    
             }else{
                System.out.println("O primeiro número informado não é divisível pelo segundo número.");}
    
        }
    }

