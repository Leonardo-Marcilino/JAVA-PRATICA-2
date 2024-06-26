package Matriz;

import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contagemPares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            if (numero % 2 == 0) {
                contagemPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contagemPares);
    }
}
