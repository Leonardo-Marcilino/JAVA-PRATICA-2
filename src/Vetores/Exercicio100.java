package Vetores;

import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = valor.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor presente na matriz é: " + maiorValor);
    }
}
