package JavaCondicionais;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Faça um programa que exiba os números de 1 a 10 usando o loop "for"
        System.out.println("1) Números de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        // 2) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "for"
        System.out.println("2) Soma dos números de 1 a 100:");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
            System.out.println(soma);
        }
        System.out.println();

        // 3) Crie um programa que exiba os números pares de 1 a 50 usando o loop "for"
        System.out.println("3) Números pares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 4) Faça um programa que leia 5 números inteiros usando o loop "for" e exiba a média aritmética
        System.out.println("4) Média de 5 números inteiros:");
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira um número inteiro: ");
            int num = scanner.nextInt();
            total += num;
        }
        double media = (double) total / 5;
        System.out.println("A média é: " + media + "\n");

        // 5) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "for"
        System.out.println("5) Tabuada de um número:");
        System.out.print("Digite um número para saber a tabuada: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        System.out.println();

        // 6) Crie um programa que leia um número inteiro positivo e exiba todos os divisores usando o loop "for"
        System.out.println("6) Divisores de um número inteiro positivo:");
        System.out.print("Digite um número inteiro positivo: ");
        int n;
        do {
            n = scanner.nextInt();
        } while (n < 1);
        System.out.println("Divisores de " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 7) Faça um programa que leia um número e determine se ele é primo usando o loop "for"
        System.out.print("7) Verificação de número primo:");
        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();
        boolean primo = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        System.out.println();

        // 8) Escreva um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "for"
        System.out.println("8) Sequência de Fibonacci:");
        int anterior = 0;
        int posterior = 1;
        System.out.print(anterior + ", " + posterior);
        for (int i = 3; i <= 20; i++) {
            int proximo = anterior + posterior;
            System.out.print(", " + proximo);
            anterior = posterior;
            posterior = proximo;
        }
        System.out.println("\n");

        // 9) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "for" e exiba a média das idades
        System.out.println("9) Média de idades de 5 pessoas:");
        total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira o nome da pessoa: ");
            scanner.nextLine(); // Limpa o buffer do scanner
            String nome = scanner.nextLine();
            System.out.print("Insira a idade da pessoa: ");
            int idade = scanner.nextInt();
            total += idade;
        }
        media = (double) total / 5;
        System.out.println("A média das idades é: " + media + "\n");

        // 10) Faça um programa que exiba os números ímpares de 1 a 50 usando o loop "for"
        System.out.println("10) Números ímpares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 11) Escreva um programa que calcule o fatorial de um número inteiro usando o loop "for"
        System.out.print("11) Fatorial de um número inteiro:");
        System.out.print("Digite um número inteiro: ");
        int fatorial = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= fatorial; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + fatorial + " é: " + resultado + "\n");

        // 12) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "for" até que o nome "fim" seja informado.
        System.out.println("12) Média de idades até o nome 'fim':");
        total = 0;
        int contagem = 0;
        String nomePessoa;
        do {
            System.out.print("Insira o nome da pessoa ou 'fim' para encerrar: ");
            scanner.nextLine(); // Limpa o buffer do scanner
            nomePessoa = scanner.nextLine();
            if (!nomePessoa.equalsIgnoreCase("fim")) {
                System.out.print("Insira a idade da pessoa: ");
                int idadePessoa = scanner.nextInt();
                total += idadePessoa;
                contagem++;
            }
        } while (!nomePessoa.equalsIgnoreCase("fim"));
        if (contagem > 0) {
            media = (double) total / contagem;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma pessoa foi inserida.");
        }

        scanner.close();
    }
}
