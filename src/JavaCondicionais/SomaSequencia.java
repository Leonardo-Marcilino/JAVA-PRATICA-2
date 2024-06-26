package JavaCondicionais;

import java.util.Scanner;

public class SomaSequencia {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("A seguir digite uma sequência de números e para encerrar digite um número negativo ");

        while (true) {
            System.out.print("Número: ");
            numero = valor.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero; 
        }

        System.out.println("A soma dos números digitados é: " + soma);

        valor.close();
    }
}
