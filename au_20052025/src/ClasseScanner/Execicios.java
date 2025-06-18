package ClasseScanner;

import java.util.Scanner;

public class Execicios {

	public static void main(String[] args) {
		/* Crie um programa que leia a distância 
		   percorrida por um carro (em km) e o 
		   tempo gasto (em horas) e escreva a 
		   velocidade média do carro. 
		   A fórmula de velocidade média é: 
		   vm = distancia(em metros) / tempo(em segundos)
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a distância pecorrida(km):");
		double distancia = scan.nextDouble();
		
		System.out.println("Informe o tempo gasto(H):");
		double tempo = scan.nextDouble();
		
		//  		metros     segundos
		//  vm = distancia / tempo
		double velocidadeMedia = (distancia * 1000) / (tempo * 3600);
		
		System.out.printf("Velocidade média: %.2f", velocidadeMedia);
	}

}
