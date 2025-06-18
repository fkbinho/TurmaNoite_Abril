package revisao;

public class LaçoWhile {

	public static void main(String[] args) {
		
		// while - testa um condição e executa se for verdadeira
		/*
		  while(codicao) { 
		  	// bloco de código a ser executado se a 
		  	// condição for verdadeira }
		 */
		int contador = 1;
		//     verdadeira
		while(contador <= 5) {
			System.out.println("Contando(while): " + contador);
			contador++; // contador = contador + 1;
		}
		
		System.out.println(" ------------------ ");
		// do while - executar 1x e depois testa a condição
		do {
			System.out.println("Contando(do-while): " + contador);
			contador++;
		} while (contador <= 5);
		
		
		// for 
		for (int i = 0; i < 10 ; i++) {
			System.out.println("(for)Contegem: " + (i+1));
		}
		
		for (int i = 0; i < 10 ; i += 2) {
			System.out.println("(for1)Contegem: " + (i+1));
		}
		
//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println("Numero par: " + i);
//			} else {
//				System.out.println("Numero impar: " + i);	
//			}
//		}
		
		contador = 10;
		while (contador > 0) {
			System.out.println("(while)Decolagem em... " + contador);
			contador--;
		}
		System.out.println(" ---------------- ");
		contador = 10;
		do {
			System.out.println("(do-while)Decolagem em... " + contador);
			contador--;
		} while (contador > 0);
		
		for(int i = 10; i > 0; i--) {
			System.out.println("(for)Decolagem em... " + i);
		}
		
		// break - continue
		contador = 1;
		while (contador <= 100) {
			if(contador == 20) {
				contador++;
				continue;
			}		
			System.out.println("Contagem: " + contador);
			contador++;
		}
		
		contador = 1;
		do {
			if(contador == 20) {
				contador++;
				continue;
			}		
			System.out.println("(do-while)Contagem: " + contador);
			contador++;
		} while (contador <= 100);
		
		for(int i = 1; i <= 100; i++) {
			if(i == 20) {
				continue;
			}	
			System.out.println("(for)Contagem: " + i);
		}
	}

}
