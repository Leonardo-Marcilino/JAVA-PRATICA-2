package JavaCondicionais;
import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = valor.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = valor.nextInt();

  
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }

        valor.close();
    }
}
