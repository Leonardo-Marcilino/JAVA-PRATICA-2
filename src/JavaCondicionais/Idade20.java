package JavaCondicionais;

import java.util.Scanner;

public class Idade20 {

    public static void main(String[] args) {
    	Scanner valor = new Scanner(System.in);

        // Problema 15: Soma das Idades de 20 Pessoas
        int somaIdades = 0;
        int totalPessoas15 = 20;

        System.out.println("PROBLEMA 15: Soma das Idades de 20 Pessoas");
        for (int i = 1; i <= totalPessoas15; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = valor.nextInt();
            somaIdades += idade;
        }
        System.out.println("A soma das idades das 20 pessoas é: " + somaIdades);
        System.out.println();

        // Problema 16: Média das Idades de 20 Pessoas
        double mediaIdades = 0.0;
        int totalPessoas16 = 20;

        System.out.println("PROBLEMA 16: Média das Idades de 20 Pessoas");
        for (int i = 1; i <= totalPessoas16; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = valor.nextInt();
            somaIdades += idade;
        }
        mediaIdades = (double) somaIdades / totalPessoas16;
        System.out.printf("A média das idades das 20 pessoas é: %.2f%n", mediaIdades);
        System.out.println();

        // Problema 17: Quantidade de Pessoas Maiores de Idade
        int pessoasMaioresIdade = 0;
        int totalPessoas17 = 20;

        System.out.println("PROBLEMA 17: Quantidade de Pessoas Maiores de Idade");
        for (int i = 1; i <= totalPessoas17; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = valor.nextInt();
            if (idade >= 18) {
                pessoasMaioresIdade++;
            }
        }
        System.out.println("O número de pessoas maiores de idade é: " + pessoasMaioresIdade);
        System.out.println();
        
        // Problema 18: Nome da Pessoa Mais Nova entre 10 Pessoas
        String nomeMaisNova = "";
        int idadeMaisNova = 0; // Inicializa com um valor alto
        int totalPessoas18 = 10;
        
        System.out.println("PROBLEMA 18: Nome da Pessoa Mais Nova entre 10 Pessoas");
        for (int i = 1; i <= totalPessoas18; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = valor.next();
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = valor.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);


        valor.close();
        
    }
}
