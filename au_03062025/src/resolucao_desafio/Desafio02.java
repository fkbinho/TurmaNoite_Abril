package resolucao_desafio;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		/* 
		 * Crie um programa que leia quatro 
		 * números inteiros e diga qual o maior
		 * e o menor número dentre eles.
		 * Depois, calcule e mostre a diferença 
		 * entre o maior e o menor.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = scan.nextInt();
		
		System.out.println("Digite o quarto número: ");
		int num4 = scan.nextInt();
		
		int maior;
		if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O número " + num1 + " é maior.");
			maior = num1;
		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("O número " + num2 + " é maior.");
			maior = num2;
		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("O número " + num3 + " é maior.");
			maior = num3;
		} else {
			System.out.println("O número " + num4 + " é maior.");		
			maior = num4;
		}
		
		int menor;
		if (num1 < num2 && num1 < num3 && num1 < num4) {
			System.out.println("O menor número é " + num1 + " menor.");
			menor = num1;
		} else if (num2 < num1 && num2 < num3 && num2 < num4) {
			System.out.println("O menor número é " + num2 + " menor.");
			menor = num2;
		} else if(num3 < num1 && num3 < num2 && num3 < num4) {
			System.out.println("O menor número é " + num3 + " menor.");
			menor = num3;
		} else {
			System.out.println("O menor número é " + num4 + " menor.");	
			menor = num4;
		}
		
		int diferenca = maior - menor;
		System.out.println("A diferença entre maior e menor é: " + diferenca);
	}
}
