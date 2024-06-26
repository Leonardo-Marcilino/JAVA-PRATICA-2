package JavaCondicionais;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Faça um programa que exiba os números de 1 a 10 usando o loop "while".
        System.out.println("1) Números de 1 a 10:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("\n");

        // 2) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while"
        System.out.println("2) Soma dos números de 1 a 100:");
        i = 1;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            System.out.println(soma);
            i++;
        }
        System.out.println();

        // 3) Crie um programa que exiba os números pares de 1 a 50 usando o loop "while"
        System.out.println("3) Números pares de 1 a 50:");
        i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // 4) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética
        System.out.println("4) Média de 5 números inteiros:");
        i = 1;
        int total = 0;
        while (i <= 5) {
            System.out.print("Insira um número inteiro: ");
            int num = scanner.nextInt();
            total += num;
            i++;
        }
        double media = (double) total / 5;
        System.out.println("A média é: " + media + "\n");

        // 5) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while"
        System.out.println("5) Tabuada de um número:");
        System.out.print("Digite um número para saber a tabuada: ");
        int num = scanner.nextInt();
        i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
        System.out.println();

        // 6) Crie um programa que leia um número inteiro positivo e exiba todos os divisores usando o loop "while"
        System.out.println("6) Divisores de um número inteiro positivo:");
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        i = 1;
        System.out.println("Divisores de " + n + ":");
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // 7) Faça um programa que leia um número e determine se ele é primo usando o loop "while"
        System.out.print("7) Verificação de número primo:");
        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();
        i = 2;
        boolean primo = true;
        while (i <= n / 2) {
            if (n % i == 0) {
                primo = false;
                break;
            }
            i++;
        }
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        System.out.println();

        // 8) Escreva um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "while"
        System.out.println("8) Sequência de Fibonacci:");
        int anterior = 0;
        int posterior = 1;
        i = 1;
        System.out.print(anterior + ", " + posterior);
        while (i <= 18) { // Primeiros 20 números da sequência de Fibonacci
            int proximo = anterior + posterior;
            System.out.print(", " + proximo);
            anterior = posterior;
            posterior = proximo;
            i++;
        }
        System.out.println("\n");

        // 9) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades
        System.out.println("9) Média de idades de 5 pessoas:");
        i = 1;
        total = 0;
        while (i <= 5) {
            System.out.print("Insira o nome da pessoa: ");
            scanner.nextLine(); // Limpa o buffer do scanner
            String nome = scanner.nextLine();
            System.out.print("Insira a idade da pessoa: ");
            int idade = scanner.nextInt();
            total += idade;
            i++;
        }
        media = (double) total / 5;
        System.out.println("A média das idades é: " + media + "\n");

        // 10) Faça um programa que exiba os números ímpares de 1 a 50 usando o loop "while"
        System.out.println("10) Números ímpares de 1 a 50:");
        i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // 11) Escreva um programa que calcule o fatorial de um número inteiro usando o loop "while"
        System.out.print("11) Fatorial de um número inteiro:");
        System.out.print("Digite um número inteiro: ");
        int fatorial = scanner.nextInt();
        int resultado = 1;
        i = 1;
        while (i <= fatorial) {
            resultado *= i;
            i++;
        }
        System.out.println("O fatorial de " + fatorial + " é: " + resultado + "\n");

        // 12) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while" até que o nome "fim" seja informado.
        System.out.println("12) Média de idades até o nome 'fim':");
        total = 0;
        int contagem = 0;
        while (true) {
            System.out.print("Insira o nome da pessoa ou 'fim' para encerrar: ");
            scanner.nextLine(); // Limpa o buffer do scanner
            String nomePessoa = scanner.nextLine();
            if (nomePessoa.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Insira a idade da pessoa: ");
            int idadePessoa = scanner.nextInt();
            total += idadePessoa;
            contagem++;
        }
        if (contagem > 0) {
            media = (double) total / contagem;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma pessoa foi inserida.");
        }

        scanner.close();
    }
}
