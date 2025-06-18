package operadores;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/* Solicite ao usuario duas notas,
		   o nome, e faça a média das notas.
		   Exiba qual a media do aluno.
		  */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Digite o nome do aluno:");
		String nome = scan.nextLine();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Aluno: " + nome);
//		System.out.println("Média: " + media);
		System.out.printf("Média: %.2f", media);
		
	}

}
