/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2906;

import java.util.Scanner;

/**
 *
 * @author Kauã
 * Crie um programa que armazene 10 números digitados pelo usuário em dois vetores:
 * um somente para números pares, e outro somente para números ímpares. Após, exiba os 
 * valores dos dois vetores na tela, em sequência. Obs.: 
* As posições que não receberem valores exibirão o número zero. 
* Não se preocupe com isso por enquanto. 
 */
public class AlgoritmoDoEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner ler = new Scanner(System.in);
     int valores[][] = new int[10][2];
        System.out.println("Entre com 10 numeros : ");  
     for (int i = 0; i < 10; i++) {
         System.out.println("Entre com o " + (i + 1) + "º numero: ");
         int valor = ler.nextInt();
         
         if(valor % 2 == 0){
         // Par.
         valores[i][0] = valor; // par.
         valores[i][1] = 0; //ímpar.
          }else{
         // Ípar.
          valores[i][0] = 0; // par.
         valores[i][1] = valor; //ímpar.
         
         }
     }
        System.out.println("\n Lista de valores : ");
        for (int i = 0; i < 10; i++) {
          System.out.printf("|%5d%3s%7d | \n",valores[i][0]," | ", valores[i][1]);     
        }
  
        
    }
    
}
