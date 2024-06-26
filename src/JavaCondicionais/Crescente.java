package JavaCondicionais;
import java.util.Scanner;

public class Crescente {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = valor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = valor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = valor.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.printf("Os números em ordem crescente são: %d, %d, %d%n", num1, num2, num3);

        valor.close();
    }
}
