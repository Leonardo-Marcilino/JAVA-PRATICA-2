package JavaCondicionais;

import java.util.Scanner;

public class SomaSequencia {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("A seguir digite uma sequ�ncia de n�meros e para encerrar digite um n�mero negativo ");

        while (true) {
            System.out.print("N�mero: ");
            numero = valor.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero; 
        }

        System.out.println("A soma dos n�meros digitados �: " + soma);

        valor.close();
    }
}
