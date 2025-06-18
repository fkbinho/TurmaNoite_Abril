package exercicios;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		/* 
		 * Escreva um programa para encontrar
		 * o maior número dentre três números
		 * fornecidos pelo usuário.
		 * */
		// 1º passo: Inicializar o scanner 
		//(o usuário irá fornecer valores)
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe primeiro numero:");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo numero:");
		num2 = scan.nextInt();
		System.out.println("Informe o terceiro numero:");
		num3 = scan.nextInt();
		
		// Para o num1 ser o maior dentre os 3 numeros:
		// num1 > num2 && num1 > num3
	
		if (num1 > num2 && num1 > num3) {
			System.out.println("O numero 1 -" + num1 + "- é o maior.");
		} else if (num2 > num3) {
			System.out.println("O numero 2 -" + num2 + "- é o maior.");
		} else {
			System.out.println("O numero 3 -" + num3 + "- é o maior.");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		int maior = Math.max(num2, Math.max(num1, num3));
				
		System.out.println("Classe Math.max: " + maior);		
	}
}
