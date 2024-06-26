package JavaCondicionais;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = valor.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = valor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        valor.close();
    }
}
