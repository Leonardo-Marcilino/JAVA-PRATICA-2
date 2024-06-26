package Vetores;

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] somaMatrizes = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = valor.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = valor.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A soma das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(somaMatrizes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
