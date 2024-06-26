package Vetores;

import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = valor.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
    }
}
