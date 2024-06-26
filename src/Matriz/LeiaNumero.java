package Matriz;

import java.util.Scanner;

public class LeiaNumero{
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = valor.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
