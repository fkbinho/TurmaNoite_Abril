package estrutura_repeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		int numero = 1;
//		while(numero < 10) {
//			System.out.println(numero);
//			
//			numero += 2; 
//		}
//		
//		System.out.println("Fora do While.");
//
//		while (true) {
//			System.out.println(numero);
//						
//			if (numero == 111) {
//				break;
//			}
//
//			numero += 2; 
//		}
//		
//		System.out.println("Fora do While.");
//	
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Digite um numero limite:");
//		int limite = scan.nextInt();
//		
//		int numero2 = 0;
//		while (numero2 <= limite) {
//			System.out.println(numero2);
//			numero2 += 2;
//		}
		
		numero = 10;
		while (numero >= 0) {
			System.out.println("Contagem regressiva: " + numero);
			numero -= 2;
		}
		
	}

}
