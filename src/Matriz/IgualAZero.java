package Matriz;

import java.util.Scanner;

public class IgualAZero {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        boolean existeZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = valor.nextInt();
            if (numero == 0) {
                existeZero = true;
            }
        }

        if (existeZero) {
            System.out.println("Existe pelo menos um número igual a zero.");
        } else {
            System.out.println("Não existe nenhum número igual a zero.");
        }
    }
}
