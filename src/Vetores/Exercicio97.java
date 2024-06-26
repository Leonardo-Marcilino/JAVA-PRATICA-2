package Vetores;

import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = valor.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
