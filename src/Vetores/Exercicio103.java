package Vetores;

import java.util.Scanner;

public class Exercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O menor valor presente na matriz é: " + menorValor);
    }
}
