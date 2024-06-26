package JavaCondicionais;

import java.util.Scanner;

public class ContagemNumero {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int totalNumeros = 20;
        int count0a100 = 0;
        int count101a200 = 0;
        int countMais200 = 0;

        System.out.println("Digite 20 números:");

        for (int i = 1; i <= totalNumeros; i++) {
            int numero = valor.nextInt();

            if (numero >= 0 && numero <= 100) {
                count0a100++;
            } else if (numero >= 101 && numero <= 200) {
                count101a200++;
            } else if (numero > 200) {
                countMais200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + count0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + count101a200);
        System.out.println("Quantidade de números maiores que 200: " + countMais200);

        valor.close();
    }
}
