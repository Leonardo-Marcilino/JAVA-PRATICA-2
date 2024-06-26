package JavaCondicionais;
import java.util.Scanner;

public class BemVindoAluno {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = valor.nextLine();

        System.out.print("Digite o turno do aluno (M para Matutino, V para Vespertino): ");
        char turno = valor.next().charAt(0);

        String saudacao;
        if (turno == 'M' || turno == 'm') {
            saudacao = "Bom dia, " + nome + "!";
        } else if (turno == 'V' || turno == 'v') {
            saudacao = "Boa tarde, " + nome + "!";
        } else {
            saudacao = "Turno não reconhecido. Por favor, informe M para Matutino ou V para Vespertino.";
        }

        System.out.println(saudacao);


        valor.close();
    }
}

