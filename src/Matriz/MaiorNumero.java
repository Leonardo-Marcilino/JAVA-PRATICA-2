package Matriz;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = valor.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
