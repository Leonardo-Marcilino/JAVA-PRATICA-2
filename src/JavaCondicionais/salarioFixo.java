package JavaCondicionais;

import java.util.Scanner;

public class salarioFixo {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nomeVendedor = valor.nextLine();

        System.out.print("Insira seu salário fixo: ");
        double salarioFixo = valor.nextDouble();

        System.out.print("Insira o total de vendas realizadas no mês em dinheiro: ");
        double totalVendas = valor.nextDouble();

        double comissao = 15 / 100.0;
        double salarioComissao = salarioFixo + (totalVendas * comissao);

        System.out.printf("%s, seu salário fixo é %.2f e o salário no final com a comissão fica %.2f%n", 
                          nomeVendedor, salarioFixo, salarioComissao);

        valor.close();
    }
}

