package laco_repeticao;

public class LacoWhile {

	public static void main(String[] args) {

		// Loop infinito
//		while (true) {
//			System.out.println("Kleber");
//		}
		
		int numero = 1;
		
//		while(numero <= 10) {
//			System.out.println(numero);
//			numero = numero + 5;
//		}
		
		numero = 10;
//		while (numero > 0) {
//			System.out.println(numero);
//			numero = numero - 2;
//		}
		
		numero = 1;
		do {
			System.out.println("do- while: " + numero);	
			numero++;
		} while (numero >= 10);
		
		numero = 1;
		while (numero >= 10) {
			System.out.println("while: " + numero);	
			numero++;
		}
		
	}

}
