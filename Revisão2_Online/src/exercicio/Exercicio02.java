package exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que peça ao usuário 
		 * números até que ele digite 0. No
		 * final, mostre a soma de todos os 
		 * número digitados.
		 */
		// 10 20 15 8 7 0 = 60 
		Scanner scan = new Scanner(System.in);
		
		int numero = 1;
		int soma = 0;
		while (numero != 0) {
			System.out.println("Digite um número:");
			numero = scan.nextInt();
			soma += numero;
		}
		
		System.out.println("Soma total: " + soma);
	}

}
