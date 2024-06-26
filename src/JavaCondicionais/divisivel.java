package JavaCondicionais;

import java.util.Scanner;

public class divisivel {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		int numero = valor.nextInt();

		if (numero % 2 == 0 && numero % 5 == 0 && numero % 10 == 0) {
			System.out.println(numero + "é divisível por 2, 5 e 10");
		} else if (numero % 2 == 0) {
			if (numero % 5 == 0) {
				System.out.println(numero + "é divisível por 2 e 5");
			} else if (numero % 10 == 0) {
				System.out.println(numero + "é divisível por 2 e 10");
			}
		} else {
			System.out.println(numero + "é 2");
		}

		valor.close();
	}
}
