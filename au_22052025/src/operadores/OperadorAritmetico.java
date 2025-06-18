package operadores;

public class OperadorAritmetico {

	public static void main(String[] args) {
		
		/*Operadores Aritméticos
		  soma -> +
		  subtracao -> -
		  multiplicação -> *
		  divisão -> /
		  resto -> %
		   */

		int valor1 = 8;
		int valor2 = 3;
		
		int soma = valor1 + valor2;
		System.out.println("Soma: " + soma);
		
		int subtracao = valor1 - valor2;
		System.out.println("Subtração: " + subtracao);
		
		int multiplicacao = valor1 * valor2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		//               CASTING
		double divisao = (double) valor1 / valor2;
		System.out.printf("Divisão: %.2f%n", divisao);
//		System.out.println("Divisão: " + divisao);

		int resto = valor1 % valor2;
		System.out.println("Resto: " + resto);
		
	}

}
