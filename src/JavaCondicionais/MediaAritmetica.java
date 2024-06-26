package JavaCondicionais;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = valor.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = valor.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = valor.nextInt();
        
        double media = (numero1 + numero2 + numero3) / 3.0;

        System.out.printf("A média aritmética é: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        valor.close();
    }
}
