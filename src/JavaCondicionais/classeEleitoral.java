package JavaCondicionais;

import java.util.Scanner;

public class classeEleitoral {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        int idade = valor.nextInt();
 
        if (idade < 16) {
            System.out.printf("Sua idade é %d, você não é eleitor (abaixo de 16 anos).%n", idade);
        } else if (idade < 65) {
            System.out.printf("Sua idade é %d, eleitor obrigatório (entre a faixa de 18 e menor de 65 anos).%n", idade);
        } else {
            System.out.printf("Sua idade é %d, eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).%n", idade);
        }

        valor.close();
    }
}
