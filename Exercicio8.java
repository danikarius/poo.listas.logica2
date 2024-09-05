package com.poo.lista2;
import java.util.Scanner;

public class Exercicio8 {


         /*8) Crie um joguinho de perguntas e respostas de múltipla escolha. O programa
         *    deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo.
         *    Se o usuário chegar até o final o programa deve exibir o número de acertos.*/
        public static void resolucao(){
            Scanner leia = new Scanner(System.in);
          int chances = 3;
          int pontuacao = 0;

          System.out.print("Qual símbolo caracteriza o operador matemático de multiplicação em lógica de programação?" +
          "\n"+
          "a) /"+
          "\n"+
          "b) +"+
          "\n"+
          "c) ."+
          "\n"+
          "d) *"+
          "\n"+
          "R: ");
          char resposta1 = leia.next().toLowerCase().charAt(0);
          if(resposta1 == 'd'){
            pontuacao ++;
          }else{
            chances--;
            System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");  
          }
          if(chances > 0){
            System.out.print("Qual o nome da terceira disciplina apresentada pelo serratec?"+
            "\n"+
            "a) Lógica de programção"+
            "\n"+
            "b) Banco de Dados"+
            "\n"+
            "c) Programaçao Orientada à Objetos (Poo)"+
            "\n"+
            "d) Interface de Programação de Aplicação (API)"+
            "\n"+
            "R: ");
            char resposta2 = leia.next().toLowerCase().charAt(0);
            if(resposta2 == 'c'){
                pontuacao++;
            }else{
                chances--;
                System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
            }
            if(chances > 0){
                System.out.print("Qual linguagem mais adequada para iniciantes na linguagem da programção para aprender lógica"+
                "\n"+
                "a) Java"+
                "\n"+
                "b) Javascript"+
                "\n"+
                "c) Potugol"+
                "\n"+
                "d) SQL"+
                "\n"+
                "R: ");
                char resposta3 = leia.next().toLowerCase().charAt(0);
                if(resposta3 == 'c'){
                    pontuacao++;
                }else{
                    chances--;
                    System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
                }
                }
                if(chances > 0){
                System.out.print("Qual desses é um comando de saída na linguagem java?"+
                "\n"+
                "a) escreva"+
                "\n"+
                "b) System.out.print()"+
                "\n"+
                "c) leia"+
                "\n"+
                "d) Scanner leia = new Scanner(System.in); "+
                "\n"+
                "R: ");
            char resposta4 = leia.next().toLowerCase().charAt(0);
            if(resposta4 == 'b'){
                pontuacao++;
            }else{
                chances--;
                System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
            }
            }
            if(chances > 0){
            System.out.print("Qual a melhor descrição para um modelo conceitual em banco de dados?"+
            "\n"+
            "a) Descreve as entidades importantes e os respectivos relacionamentos"+
            "\n"+
            "b) Representa o banco de dados como uma coleção de relações"+
            "\n"+
            "c) Representação textual de um banco de dados, que descreve como os dados serão armazenados e seus relacionamentos"+
            "\n"+
            "d) Descreve, por meio de alguma linguagem, como será feita a armazenagem no banco"+
            "\n"+
            "R: ");
            char resposta5 = leia.next().toLowerCase().charAt(0);
            if(resposta5 == 'a'){
            pontuacao++;
            }else{
            chances--;
            System.out.println("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
        }
        }
        if(chances ==0){
        System.out.println("Você esgotou suas chances! Fim de jogo.");
        }else{
        System.out.println("Sua pontuação final é de: "+pontuacao+" de 5. Parabéns, você ganhou!");
    }leia.close();}
     }    
 }       

