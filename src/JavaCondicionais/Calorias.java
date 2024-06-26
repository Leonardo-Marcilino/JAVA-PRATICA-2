package JavaCondicionais;

import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		int vegetariano = 180;
		int carne = 350;
		int peixe = 230;
		int frango = 250;

		int abacaxi = 75;
		int sorveteDiet = 110;
		int mouseDiet = 170;
		int mouseChocolate = 200;

		int cha = 20;
		int sucoDeLaranja = 70;
		int sucoDeMelao = 100;
		int refrigeranteDiet = 65;

		int opcao;
		int refeicaoCompleta = 0;

		System.out.println("Escolha um prato: 1) Vegetariano, 2)Peixe, 3)Frango, 4)Carne");
		opcao = valor.nextInt();

		switch (opcao) {
		case 1:
			refeicaoCompleta += vegetariano;
			break;
		case 2:
			refeicaoCompleta += peixe;
			break;
		case 3:
			refeicaoCompleta += frango;
			break;
		case 4:
			refeicaoCompleta += carne;
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

		System.out.println("Escolha uma sobremessa: 1) Abacaxi, 2)Sorvete Diet, 3)Mouse Diet, 4)Mouse de chocolate");
		opcao = valor.nextInt();

		switch (opcao) {
		case 1:
			refeicaoCompleta += abacaxi;
			break;
		case 2:
			refeicaoCompleta += sorveteDiet;
			break;
		case 3:
			refeicaoCompleta += mouseDiet;
			break;
		case 4:
			refeicaoCompleta += mouseChocolate;
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

		System.out.println("Escolha uma bebida: 1) Ch�, 2)Suco de laranja, 3)Suco de mel�o, 4)Refrigerante Diet");
		opcao = valor.nextInt();

		switch (opcao) {
		case 1:
			refeicaoCompleta += cha;
			break;
		case 2:
			refeicaoCompleta += sucoDeLaranja;
			break;
		case 3:
			refeicaoCompleta += sucoDeMelao;
			break;
		case 4:
			refeicaoCompleta += refrigeranteDiet;
			break;
		default:
			System.out.println("Opção inválida");
		}

		System.out.println("A quantidade total de caloria do seu prato � de: " + refeicaoCompleta);
		valor.close();
	}

}
