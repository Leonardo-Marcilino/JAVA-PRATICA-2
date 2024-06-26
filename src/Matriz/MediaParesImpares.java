package Matriz;

import java.util.Scanner;

public class MediaParesImpares {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0;
        int contagemPares = 0, contagemImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
                contagemPares++;
            } else {
                somaImpares += numero;
                contagemImpares++;
            }
        }

        double mediaPares = contagemPares == 0 ? 0 : (double) somaPares / contagemPares;
        double mediaImpares = contagemImpares == 0 ? 0 : (double) somaImpares / contagemImpares;

        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Média dos números ímpares: " + mediaImpares);
    }
}
