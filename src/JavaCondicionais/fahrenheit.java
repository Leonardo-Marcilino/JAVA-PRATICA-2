package JavaCondicionais;

import java.util.Scanner;

public class fahrenheit {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira a temperatura em Celsius: ");
        double grausCelsius = valor.nextDouble();

        double fahrenheit = (9 * grausCelsius + 160) / 5;

        System.out.printf("A temperatura em %.2f °C convertida em Fahrenheit é %.2f °F%n", grausCelsius, fahrenheit);

        valor.close();
    }
}
