package JavaCondicionais;
import java.util.Scanner;

public class ValidacaoAluno {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = valor.nextInt();
        
        if (faltas > 15) {
            System.out.println("O aluno está reprovado por falta.");
        } else {
            System.out.println("O aluno não está reprovado por falta.");
        }

        valor.close();
    }
}
