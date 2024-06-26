package JavaCondicionais;

public class soma1a15 {

    public static void main(String[] args) {
        int x = 1;
        int y = 15;
        int soma = 0;

        while (x <= y) {
            soma += x;
            x++;
        }

        System.out.println("A soma de 1 até 15 é " + soma);
    }
}
