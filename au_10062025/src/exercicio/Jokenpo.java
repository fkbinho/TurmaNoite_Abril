package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		/*
		  Crie um jogo simples de Pedra, Papel e Tesoura. 
		  O jogador escolhe uma opção
		  (Pedra, Papel, Tesoura), 
		  o computador escolhe aleatoriamente uma opção 
		  e o programa determina o vencedor.
		  
		  Regras:
		  -> Pedra ganha da Tesoura 
		  -> Tesoura ganha do Papel 
		  -> Papel ganha da Pedra
		 */

		Scanner scan = new Scanner(System.in);

		Random random = new Random();
		
		int escolhaComputador = random.nextInt(3); // 0 1 2
		
		String jogadaComputador;
		if (escolhaComputador == 0) {
			jogadaComputador = "Pedra";
		} else if (escolhaComputador == 1) {
			jogadaComputador = "Papel";
		} else {
			jogadaComputador = "Tesoura";
		}
		
		String menu = """
				Escolha uma opção:
			    1 - Pedra
			    2 - Papel
			    3 - Tesoura
				""";
		
		System.out.println(menu);
		String escolhaJogador = scan.nextLine();
		
		if (escolhaJogador.equalsIgnoreCase(jogadaComputador)) {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + jogadaComputador);
			System.out.println("EMPATE!");
		} else if (escolhaJogador.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Papel")
				|| escolhaJogador.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Tesoura")
				|| escolhaJogador.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Pedra")
				) {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + jogadaComputador);
			System.out.println("VOCÊ PERDEU!");
		} else {
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + jogadaComputador);
			System.out.println("VOCÊ VENCEU!");
		}
	}
}
