package Matriz;

import java.util.Scanner;

public class LeiaNumero10 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
