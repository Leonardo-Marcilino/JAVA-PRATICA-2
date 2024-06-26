package Vetores;

import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = valor.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / 16;
        System.out.println("A média aritmética dos elementos é: " + media);
    }
}
