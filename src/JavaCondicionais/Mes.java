package JavaCondicionais;
import java.util.Scanner;

public class Mes {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o nome de um mês: ");
        String mes = valor.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês de " + mes + " possui 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês de " + mes + " possui 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês de " + mes + " possui 28 ou 29 dias.");
                break;
            default:
                System.out.println("Nome do mês inválido.");
                break;
        }

        valor.close();
    }
}
