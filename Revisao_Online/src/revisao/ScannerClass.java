package revisao;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int numero = scan.nextInt();
		
		System.out.println("Digite um numero REAL:");
		double numero2 = scan.nextDouble();
		scan.nextLine(); // limpar o buffer
		
//		                     0 - 5
		System.out.println("Digite um caractere:");
		char caractere = scan.nextLine().charAt(0); // Casa Amarela
		
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(caractere);
		
	}
}
