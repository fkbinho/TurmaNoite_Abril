package revisao;

import java.util.Scanner;

public class EstruturaCondicional {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		String login = "admin";
		String senha = "12345";
		
		System.out.print("Login: ");
		String loginDigitado = scan.nextLine().toLowerCase();
		
		System.out.print("Senha: ");
		String senhaDigitada = scan.nextLine();
		

		if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
			System.out.println("Logado com sucesso!");
		} else {
			System.out.println("Login ou senha incorretos!");
		}
	}
	
}
