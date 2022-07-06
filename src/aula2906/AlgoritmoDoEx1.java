/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2906;

import java.util.Scanner;

/**
 *
 * @author Kauã
 * Criar algoritmo que guarde informações de 15 alunos: nome,
 * nota1, nota2, nota3, média.
 */
public class AlgoritmoDoEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        int nAlunos, nNotas;
        
        System.out.println("Informe número de Alunos: ");
        nAlunos = ler.nextInt();
        System.out.println("Informe número de Notas: ");
        nNotas = ler.nextInt();
       
        

//Cria matriz de notas
        float[][] notas = new float[nAlunos][(nNotas + 1)];

//Cria vetor para nomes de alunos
        String[] alunos = new String[nAlunos];

        System.out.println("Notas de Alunos: ");
        for (int i = 0; i < nAlunos; i++) { // linha.
            System.out.println("Nome aluno " + (i + 1) + ":");
            alunos[i] = ler.next();
            System.out.println("Notas: ");

// Este for serve para percorre as colunas da matriz de notas           
            for (int j = 0; j < nNotas; j++) { // coluna.
                System.out.println("Nota " + (j + 1) + " : ");
                notas[i][j] = ler.nextFloat();
                
// Soma de todas as notas               
                notas[i][(nNotas)] += notas[i][j];  
            }

// Média        
            notas[i][(nNotas)] = notas[i][(nNotas)] / nNotas;
        }
        System.out.println("\n.: Impressão : \n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println(" Aluno " + (i + 1) + " : " + alunos[i]);
            for (int j = 0; j < (nNotas); j++) {
                System.out.println("- Nota " + (j + 1) + " : " + notas[i][j]);
            }
            System.out.println("- Media : "  + notas[i][nNotas]);
            System.out.println("---");
        }

    }

}
