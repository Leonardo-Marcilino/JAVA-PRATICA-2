package JavaCondicionais;
import java.util.Scanner;

public class Aposentadoria{

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = valor.nextInt();
        
        System.out.print("Digite o seu sexo (M para masculino, F para feminino): ");
        char sexo = valor.next().toUpperCase().charAt(0);

        if (sexo == 'M' && idade >= 65) {
            System.out.println("Você pode se aposentar.");
        } else if (sexo == 'F' && idade >= 60) {
            System.out.println("Você pode se aposentar.");
        } else {
            System.out.println("Você não pode se aposentar.");
        }

        valor.close();
    }
}
