package Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = valor.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
