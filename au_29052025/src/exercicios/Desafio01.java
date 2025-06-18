package exercicios;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que simula o comportamento
		 * de um sinal inteligente de trânsito.
		 * Ele deverá tomar decisões com base nas seguintes entradas:
		 * 1. Cor do sinal (vermelho, amarelo, verde).
		 * 2. Existe pedestre esperando para atravessar? 
		 * 	  Pode ser "SIM" ou "NÃO".
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a cor do sinal"
				+ "(verde, amarelo, vermelho):");
		String semaforo = scan.nextLine().toUpperCase();
		
		System.out.println("Existe pedestre esperando:");
		String pedestre = scan.nextLine().toUpperCase();
		
		if (semaforo.equals("VERDE")) {
			if (pedestre.equals("SIM")) {
				System.out.println("Mudar para AMARELO. "
						+ "Em breve, o sinal ficará VERMELHO.");
			} else {
				System.out.println("Manter no VERDE."
						+ " Não pedestre esperando.");
			}
		} else if (semaforo.equals("AMARELO")) {
			System.out.println("Semaforo mudando para vermelho."
					+ " Em breve o semaforo fechará.");
		} else if (semaforo.equals("VERMELHO")) {
			if(pedestre.equals("SIM")) {
				System.out.println("Pedestre pode atravessar "
						+ "com segurança;"); 
			} else {
				System.out.println("Mudar sinal para VERDE."
						+ " Nenhum pedestre no momento.");
			}
		} else {
			System.out.println("Cor de sinal inválida...");
		}
		
		//métodos da class String
		// .toUpperCase() -> converte a String para letras maiusculas
		// .toLowerCase() -> converte a String para letras minusculas
		// .equals() -> compara o conteudo da String
		// .equalsIgnoreCase() -> ignora se é maiuscula ou minuscula
	}
}
/* EXEMPLO:
 	Caso 1:
	Cor: VERDE

	Pedestre: SIM
	👉 Saída: Mudar para AMARELO. 
	   Em breve, o sinal ficará VERMELHO.

	Caso 2:
	Cor: VERMELHO

	Pedestre: NAO
	👉 Saída: Manter sinal VERMELHO. 
	   Nenhum pedestre no momento.

	Caso 3:
	Cor: AZUL
	👉 Saída: Cor de sinal inválida...


 * *
 */