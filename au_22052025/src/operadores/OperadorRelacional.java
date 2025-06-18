package operadores;

public class OperadorRelacional {

	public static void main(String[] args) {

		int valor1 = 16;
		int valor2 = 18;
		
		boolean resultado = valor1 > valor2;
		System.out.println(resultado);
		
		resultado = valor1 < valor2;
		System.out.println(resultado);
		
		resultado = valor1 >= valor2;
		System.out.println(resultado);

		resultado = valor1 <= valor2;
		System.out.println(resultado);
		
		resultado = valor1 == valor2;
		System.out.println(resultado);
		
		resultado = valor1 != valor2;
		System.out.println(resultado);

		// OPERADORES LÓGICOS
		// || -> OU
		// && -> E
		// ! -> (NOT) INVERTE O VALOR DA EXPRESSÃO
		
		System.out.println(valor1 >= valor2 || valor1 < valor2);
		System.out.println(valor1 >= valor2 && valor1 < valor2);
		System.out.println(!(valor1 >= valor2 && valor1 < valor2));
		
		System.out.println(!(valor1 >= valor2) && valor1 < valor2);
		
	}

}
