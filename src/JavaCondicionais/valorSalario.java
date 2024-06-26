package JavaCondicionais;

import java.util.Scanner;

public class valorSalario {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira o salário mínimo: ");
        double salarioMinimo = valor.nextDouble();

        System.out.print("Insira seu salário: ");
        double salario = valor.nextDouble();

        double soma = 0;
        int qtd = 0;

        while (soma < salario) {
            soma += salarioMinimo;
            qtd += 1;
        }

        System.out.printf("A quantidade de salários mínimos que você ganha é de " + qtd);

        valor.close();
    }
}
