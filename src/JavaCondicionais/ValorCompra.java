package JavaCondicionais;
import java.util.Scanner;

public class ValorCompra {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = valor.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = valor.nextInt();

        double precoProduto = 0.0;

        switch (codigoProduto) {
            case 1:
                precoProduto = 10.0;  
                break;
            case 2:
                precoProduto = 20.0;
                break;
            case 3:
                precoProduto = 30.0;
                break;
            case 4:
                precoProduto = 40.0;
                break;
            case 5:
                precoProduto = 50.0; 
                break;
            default:
                System.out.println("Código do produto inválido.");
                valor.close();
                return;
        }

        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total a ser pago é: %.2f%n", valorTotal);
        
        valor.close();
    }
}
