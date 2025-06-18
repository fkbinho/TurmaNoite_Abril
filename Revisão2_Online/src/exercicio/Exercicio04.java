package exercicio;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		/*
		 * Crie um programa que simula o saque de um caixa eletrônico.
		 * 1. Peça ao usuário um valor para sacar (entre R$10 e R$1000) ok
		 * 2. O programa deve informar quantas notas de cada valor serão
		 * entregues, considerando as cédulas: 
		 * 		R$100, R$50, R$20 e R$10     ok
		 * 3. Deve repetir até o usuário digitar 0 para sair. ok
		 * 4. Validar se o valor está no intervalo permitido. ok
		 * 5. Mostrar a menor quantidade de notas possível. ok
		 * 
		 * ex.: 370
		 * Notas de 100: 3
		 * Notas de 50: 1
		 * Notas de 20: 1
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite o valor para sacar(10 a 1000) ou 0 para sair:");
			int valor = scan.nextInt();
			
			// caso o usário digite 0 - encerra o programa.
			if (valor == 0) {
				System.out.println("Encerrando o programa...");
				break;
			}
			
			// valida o intervalo: menor que 10 ou maior 1000
			if (valor < 10 || valor > 1000) {
				System.out.println("Valor inválido.");
				continue; // volta para o início do laço while
			}
			
			// calculo das notas  Ex.: 377
			int nota100 = valor / 100; // 377 / 100 = 3,77 = 3x notas 100
			valor = valor % 100; // 70
			
			int nota50 = valor / 50; // 77 / 50 = 1,27 = 1x nota 50
			valor = valor % 50;  // 27
			
			int nota20 = valor / 20; // 27 / 20 = 1,07 = 1x nota 20
			valor = valor % 20;
			
			int nota10 = valor / 10; // 7 / 10 = 0,7 = 0 notas
			valor = valor % 10; // 7
			
			// exibir o resultado
			System.out.println("Notas fonercidas: ");
			if (nota100 > 0) {
				System.out.println("R$100: " + nota100);
			} 
			if (nota50 > 0) {
				System.out.println("R$50: " + nota50);
			}
			if (nota20 > 0) {
				System.out.println("R$20: " + nota20);
			}
			if (nota10 > 0) {
				System.out.println("R$10: " + nota10);
			}
			
			if (valor != 0) {
				System.out.print("Valor restante de R$" + valor);
				System.out.println(" não pode ser sacado com as cédulas disponíveis.");
			}
		}
	}
}
