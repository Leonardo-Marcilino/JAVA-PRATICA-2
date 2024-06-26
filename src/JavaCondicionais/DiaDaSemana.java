package JavaCondicionais;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Insira um número de 1 à 7 e descubra o dia da semana que ele representa \n");
		int dia = valor.nextInt();
		
		switch(dia) {
		 	case 1:
			 	System.out.println("Domingo");
				break;
		 	case 2:
		 		System.out.println("Segunda");
		 		break;
		 	case 3:
		 		System.out.println("Terça-feira");
		 		break;
		 	case 4:
		 		System.out.println( "Quarta-feira");
		 		break;
		 	case 5:
		 		System.out.println("Quinta-feira");
		 		break;
		 	case 6: 
		 		System.out.println("Sexta-feira");
		 		break;
		 	case 7:
		 		System.out.println("Sábado");
		 	default:
		 		System.out.println("Esse valor não corresponde a nenhum dia da Semana, rode novamente o programa");
		}
		valor.close();
	}

}
