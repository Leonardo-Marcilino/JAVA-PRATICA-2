package Matriz;

import java.util.Scanner;

public class Leia7 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            soma += numero;
        }

        double media = (double) soma / 7;
        System.out.println("A média aritmética é: " + media);
    }
}