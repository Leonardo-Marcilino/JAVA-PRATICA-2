package JavaCondicionais;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		
		float n1 = valor.nextFloat();
		float n2 = valor.nextFloat();
		float n3 = valor.nextFloat();
		float n4 = valor.nextFloat();
		
		float media = (n1 + n2 + n3 + n4) / 4;
		
		if(media > 7) {
			System.out.println("Aluno aprovado \n");
			
		}else if(media > 5) {
			System.out.println("Aluno em Recuperação \n");
		}else {
			System.out.println("Aluno Reprovado \n");
		}
		
		System.out.println("Sua média foi: " + media);
		
		valor.close();
	}
}
