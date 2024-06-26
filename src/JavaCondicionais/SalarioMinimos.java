package JavaCondicionais;
import java.util.Scanner;

public class SalarioMinimos {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = valor.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = valor.nextDouble();

        double qtdSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f salários-mínimos.%n", qtdSalariosMinimos);

        valor.close();
    }
}
