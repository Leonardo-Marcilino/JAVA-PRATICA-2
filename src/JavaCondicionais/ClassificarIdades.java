package JavaCondicionais;
import java.util.Scanner;

public class ClassificarIdades {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = valor.nextInt();

        if (idade < 12) {
            System.out.println("Criança você.");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um senhor.");
        }

        valor.close();
    }
}
