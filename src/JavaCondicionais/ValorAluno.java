package JavaCondicionais;
import java.util.Scanner;

public class ValorAluno {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = valor.nextDouble();

        String conceito;
        if (nota >= 9.0 && nota <= 10.0) {
            conceito = "Exelent";
        } else if (nota >= 7.5 && nota < 9.0) {
            conceito = "ta ai né";
        } else if (nota >= 6.0 && nota < 7.5) {
            conceito = "raspo nego";
        } else if (nota >= 4.0 && nota < 6.0) {
            conceito = "vai de arrrasta em";
        } else if (nota >= 0.0 && nota < 4.0) {
            conceito = "foi de arrasta";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Conceito do aluno: " + conceito);

        valor.close();
    }
}
