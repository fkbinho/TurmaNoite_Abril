package exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Somar numeros entre 1 - N 
		// ex.: 1+2+3+4+5 = 15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		int i = 1;
		int soma = 0;
		
		while (i <= numero) {
			soma += i; // soma = soma + i;
			i++;
		}
		
		System.out.println("(while)Soma: " + soma);
		
		System.out.println("-------------------------");
		
		soma = 0;
		for(int j = 1; j <= numero; j++) {
			soma += j;
		}
		System.out.println("(for)Soma: " + soma);
	}

}
