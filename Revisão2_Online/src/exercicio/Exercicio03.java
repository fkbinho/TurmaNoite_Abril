package exercicio;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que imprima a tabuada 
		 * do número que o usuário digitar
		 * Tabuada de 1 - 10.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um número:");
			int num = scan.nextInt();
			scan.nextLine();
			
			System.out.println("===== TABUADA =====");
			for(int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
			
			System.out.println("Deseja sair (s/n):");
//			String sair = scan.nextLine();
//			if(sair.equalsIgnoreCase("s")) {
//				break;
//			}
			char sair = scan.nextLine().charAt(0);
			if (sair == 's' || sair == 'S') {
				break;
			}
		}
		System.out.println("Obrigado por usar nossa Tabuada!");
		
		/*
		 usuaria digitar 5
		 5 x 1 = 5
		 5 x 2 = 10
		 5 x 3 = 15
		 5 x 4 = 20
		 5 x 5 = 25
		 5 x 6 = 30
		 5 x 7 = 35
		 5 x 8 = 40
		 5 x 9 = 45
		 5 x 10 = 50
		 */
		
	}

}
