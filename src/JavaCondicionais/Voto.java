package JavaCondicionais;

import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = valor.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("A pessoa é obrigada a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("A pessoa pode votar, mas não é obrigada.");
        } else {
            System.out.println("A pessoa não pode votar.");
        }

        valor.close();
    }
}
