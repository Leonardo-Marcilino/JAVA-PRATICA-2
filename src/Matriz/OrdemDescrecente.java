package Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDescrecente {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = valor.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem decrescente:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
