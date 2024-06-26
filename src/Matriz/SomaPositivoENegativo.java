package Matriz;

import java.util.Scanner;

public class SomaPositivoENegativo {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("A soma dos valores positivos é: " + somaPositivos);
        System.out.println("A soma dos valores negativos é: " + somaNegativos);
    }
}
