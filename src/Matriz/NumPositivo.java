package Matriz;

import java.util.Scanner;

public class NumPositivo {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contagemPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            if (numero > 0) {
                contagemPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contagemPositivos);
    }
}
