package estrutura_condicional;

import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {
		
		/* Solicite ao usuario duas notas,
		   o nome, e faça a média das notas.
		   Exiba qual a media do aluno
		   e a sua situação:
		   media >= 7 -> Aprovado!
		   Media entre 4 e 6,9 -> Recuperação!
		   media < 4 -> Reprovado!
		  */
		
		// Instanciando o scanner
		Scanner scan = new Scanner(System.in);
		
		// Solicitando as informações do usuário e
		// salvando em suas variáveis
		System.out.println("Informe a 1ª nota:");
		double nota1 = scan.nextDouble();

		System.out.println("Informe a 2ª nota:");
		double nota2 = scan.nextDouble();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Informe o nome do aluno:");
		String nome = scan.nextLine();

		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média do aluno é " + media);
		
		if (media >=7 ) {
			if(media == 10) {
				System.out.println("Aprovado com Louvor");
			} else {
				System.out.println("Aprovado!");
			}
		} else if (media >= 4) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		
		
	}

}
