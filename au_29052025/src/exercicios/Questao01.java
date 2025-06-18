package exercicios;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		/* 
		 * Escrever um programa que leia um número inteiro
		 * e verifique se ele é positivo ou negativo.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = scan.nextInt();
		
		boolean condicao = numero >= 0;
		
		if (condicao) {
			System.out.println(String.format("O numero %d é positivo.", numero));
		} else {
			System.out.println("O numero " + numero + " é negativo.");
		}
	
	}
}