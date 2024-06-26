package JavaCondicionais;

import java.util.Scanner;

public class reajusteSalario {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira seu salário: ");
        double salario = valor.nextDouble();

        double reajuste = salario * 0.015;
        double novoSalario = salario + reajuste;

        System.out.printf("O seu salário com reajuste de 1.5%% é de " + novoSalario);

        valor.close();
    }
}

