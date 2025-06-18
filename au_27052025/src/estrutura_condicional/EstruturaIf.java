package estrutura_condicional;

public class EstruturaIf {

	public static void main(String[] args) {
		
		/* Estrutura condicional
		 * IF - Simples
		 * 
		 * if (condição) {
		 * 	// bloco de codigo a ser executado caso
		 *  // a condição seja verdadeira
		 * }
		 *  */
		
		int numero = 10;
		
		if (numero % 2 == 0) {
			System.out.println("Par!");
		} 
		
		System.out.println("_________________________");
		
		int idade = 7;
		
//		if (idade >= 18) {
//			System.out.println("É maior de idade.");
//		} else {
//			System.out.println("É menor de idade.");
//		}
		
		String faseDavida = "";
		// IF - composto
		if(idade >= 18) {
			faseDavida = "Adulto";
		} else if (idade >= 12) {
			System.out.println("Adolescente");
		} else if(idade >= 5) {
			System.out.println("Criança");
		} else {
			System.out.println("Bebê");
		} 
		
		
		
		// fora do if
		System.out.println("Fim do programa!");

	}

}
