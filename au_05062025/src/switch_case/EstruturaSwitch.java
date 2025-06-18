package switch_case;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {

		// RESOLUÇÃO DO EXERCÍCIO DO BANCO

		/*
		 * O usuário começa com um saldo inicial e pode escolher entre as opções: 1 -
		 * Depositar 2 - Sacar 3 - Transferir 4 - Sair
		 * 
		 * O programa deve validar que não é possivel transferir ou sacar mais do que o
		 * saldo disponível. Após cada operação, o saldo atualizado deve ser exibido. O
		 * programa só deve encerrar quando o usuário escolher a opção 4 - Sair.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o saldo da conta:");
		double saldo = scan.nextDouble();

//		boolean continuar = true;
		while (true) {
			System.out.println("==== Banco Fuctura ====");
			System.out.println("Escolha uma das opções abaixo");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Transferir");
			System.out.println("4. Sair");

			int opcao = scan.nextInt();
			
			if (opcao == 4) {
				System.out.println("Saindo do sistema...");
				System.out.printf("%nSaldo atual: R$ %.2f%n%n", saldo);
				break;
			}

			switch (opcao) {
			case 1:
				System.out.println("Qual o valor para o deposito:");
				double deposito = scan.nextDouble();

				if (deposito > 0) {
					saldo += deposito; // saldo = saldo + deposito;
					System.out.println("Deposito realizado com sucesso.");
				} else {
					System.out.println("Valor inválido para deposito.");
				}
				break;
			case 2:
				System.out.println("Qual o valor para saque:");
				double saque = scan.nextDouble();

				if (saque > 0 && saque <= saldo) {
					saldo -= saque; // saldo = saldo - saque;
					System.out.println("Saque realizado com sucesso.");
				} else {
					System.out.println("Valor invalido ou saldo insuficiente.");
				}
				break;
			case 3:
				System.out.println("Qual o valor para a transferência.");
				double transferencia = scan.nextDouble();

				if (transferencia > 0 && transferencia <= saldo) {
					saldo -= transferencia;
					System.out.println("Transferência realizada com sucesso.");
				} else {
					System.out.println("Valor invalido ou saldo insuficiente.");
				}
				break;
//			case 4:
//				System.out.println("Saindo do sistema...");
//				continuar = false;
//				break;
			default:
				System.out.println("Opção inválida.");
			}

			System.out.printf("%nSaldo atual: R$ %.2f%n%n", saldo);
		}
	}

}
