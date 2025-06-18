package revisao;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------Calculadora------");
		System.out.println("Digite primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Digite a operação(+, -, *, /):");
		char operacao = scan.nextLine().charAt(0);
		
		int resultado = 0;
		if(operacao == '+') {
			resultado = num1 + num2;
			System.out.println("Resultado da Soma: " + resultado);
		} else if(operacao == '-') {
			resultado = num1 - num2;
			System.out.println("Resultado da Subtração: " + resultado);
		} else if(operacao == '*') {
			resultado = num1 * num2;
			System.out.println("Resultado da Multiplicação: " + resultado);
		} else if(operacao == '/') {
			if(num2 == 0) {
				System.out.println("Erro: Divisão por zero não é permitido.");
			} else {
				resultado = num1 / num2;
				System.out.println("Resultado da Divisão: " + resultado);
			}
		} else {
			System.out.println("Operação inválida. Use apenas +, -, *, /");
		}
		
	}
}
