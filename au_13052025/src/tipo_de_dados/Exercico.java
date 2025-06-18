package tipo_de_dados;

import java.util.Scanner;

public class Exercico {

	public static void main(String[] args) {

		/* Declare variaveis com seus valores
		 * nome, idade, sexo, peso, altura.
		 * e exiba-os no console.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scan.nextLine();
	
		System.out.println("Digite a idade:");
		int idade = scan.nextInt();
		
		System.out.println("Digite o sexo (M/F):");
		char sexo = scan.next().charAt(0);
		
		System.out.println("Informe o peso:");
		float peso = scan.nextFloat();
		
		System.out.println("Informe o Altura:");
		double altura = scan.nextDouble();
		
								// + -> CONCATENAR
//		System.out.println("Nome: " + nome);
//		System.out.print("Idade: " + idade + "\n");
//		System.out.println("Sexo: " + sexo);
//		System.out.print("Peso: " + peso);
//		System.out.print("\nAltura: " + altura);
		
		System.out.printf("Nome: %s %nIdade: %d %nSexo: %c"
				, nome, idade, sexo);
		System.out.printf("%nPeso: %.2f %nAltura: %.2f"
				, peso, altura);
	}

}
