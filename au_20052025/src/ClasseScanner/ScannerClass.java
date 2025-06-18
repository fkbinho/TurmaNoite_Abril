package ClasseScanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// Atalho para importação -> ctrl + shift + o 
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o seu nome:");
		String nome = scan.nextLine();
		//System.out.println("Meu nome é " + nome);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		//System.out.println("Minha idade é " + idade);
		
		System.out.println("Informe a altura:");
		double altura = scan.nextDouble();
		scan.nextLine(); // limpa o buffer
		//System.out.println("Minha altura é " + altura);
		
		System.out.println("Digite sua nacionalidade:");
		String nacionalidade = scan.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = scan.next();
		scan.nextLine();
		/*
		
		0 1 2 3 4 5 6 7 8 9  10  11
		P e d r o   S o a r  e   s
		
		*/
		System.out.println("Digite o seu sexo (M/F):");
		char sexo = scan.nextLine().charAt(0);
		
//		System.out.println("Meu nome é " + nome + " " + sobrenome 
//				+ ", e minha idade é " + idade + " e altura " + altura + "."
//				+ "\nMinha nacionalidade é " + nacionalidade);

		
		System.out.printf("Meu nome é %s %s, e minha idade é %d "
				+ "e altura %.2f."
				+ "%nMinha nacionalidade é %s"
				+ "%nSexo: %c", 
				nome, sobrenome, idade, altura, nacionalidade, sexo);
	
		/*Casos que precisam limpar o BUFFER:
		 * 1) se primeiro vier um next() e depois um nextLine()
		 * 2) se primeiro vier nextInt() / nextDouble(), em todo caso
		 * 	  trabalhar com entrada de valor numérico, e depois vier
		 * 	  nextLine().*/
	}

}
