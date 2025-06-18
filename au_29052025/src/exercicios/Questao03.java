package exercicios;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia três números inteiros
		 * e verifique se:
		 * 1. Todos são iguais
		 * 2. Apenas dois são iguais
		 * 3. Todos são diferentes
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("Todos os números são iguais.");
		} else if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Apenas 2 números são iguais");
		} else {
			System.out.println("Todos os números são diferentes.");
		}
		
	}
}
