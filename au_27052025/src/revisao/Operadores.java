package revisao;

public class Operadores {

	public static void main(String[] args) {

		 /* declarando uma variável do tipo inteiro
		 	<tipo> nome_da_variavel;
		 */
		int numero;
		
		// Atribuindo valor a minha variável
		numero = 10;
		
		// inicializando a variavel
		int valor = 5;
		
		int resultado = numero % 4;
		// resultado vai receber o resto da divisão de
		// numero por 4
		
		System.out.println(resultado);
		
		System.out.println("---------------------");
		
		valor += 2;
//		valor = valor + 2;
		
		valor -= 2; 
//		valor = valor - 2;
		
		valor *= 2;
//		valor = valor * 2;

		valor %= 2;
//		valor = valor % 2;
		

	}

}
