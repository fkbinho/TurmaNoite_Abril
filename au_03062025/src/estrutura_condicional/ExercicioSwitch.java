package estrutura_condicional;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 12: ");
		int numero = scan.nextInt();
		
//		switch(numero) {
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("Primeiro Trimestre.");
//		break;
//		case 4, 5, 6:
//			System.out.println("Segundo Trimestre.");
//		break;
//		case 7, 8, 9:
//			System.out.println("Terceiro Trimestre.");
//		break;
//		case 10, 11, 12:
//			System.out.println("Quarto Trimestre.");
//		break;
//		default:
//			System.out.println("Valor inválido. "
//					+ "Digite entre 1 e 12.");
//		}
		
		switch (numero) {
		case 1, 2, 3 -> System.out.println("1º trimestre.");
		case 4, 5, 6 -> System.out.println("2º trimestre.");
		case 7, 8, 9 -> System.out.println("3º trimestre.");
		case 10, 11, 12 -> System.out.println("4º trimestre.");
		default -> System.out.println("Valor inválido.");
		}
		
		String mensagem = switch (numero) {
		case 1, 2, 3 -> "1º trimestre.";
		case 4, 5, 6 -> "2º trimestre.";
		case 7, 8, 9 -> "3º trimestre.";
		case 10, 11, 12 -> "4º trimestre.";
		default -> "Valor inválido.";
		};
		
		System.out.println(mensagem.toUpperCase());

	}

}
