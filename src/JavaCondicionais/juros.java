package JavaCondicionais;

import java.util.Scanner;

public class juros {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o valor médio: ");
        double saldoMedio = valor.nextDouble();

        double percentual = 0;
        double credito;

        if (saldoMedio >= 0 && saldoMedio <= 500) {
            percentual = 30 / 100.0;
        } else if (saldoMedio <= 3000) {
            percentual = 40 / 100.0;
        } else if (saldoMedio > 3000) {
            percentual = 50 / 100.0;
        }

        credito = percentual * saldoMedio;

        System.out.printf("O valor médio é de %.2f e a quantidade de créditos é %.2f%n", saldoMedio, credito);
        
        valor.close();
    }
}
