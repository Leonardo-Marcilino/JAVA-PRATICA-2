package JavaCondicionais;

import java.util.Scanner;

public class antecessorSucessor {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = valor.nextInt();

        int antecessor = n - 1;
        int sucessor = n + 1;

        System.out.printf("Antecessor é " + antecessor + "<" + n + "> o sucessor o é " + sucessor);

        valor.close();
    }
}

