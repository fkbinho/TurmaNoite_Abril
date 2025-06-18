package laco_repeticao;

public class LacoFor {

	public static void main(String[] args) {

		//inicialização | condição | iterador
		for(int num = 0; num <= 10; num++) {
			System.out.println(num);
		}
		
		System.out.println("-------------------------------");
		
		for(int num = 10; num >= 0; num--) {
			System.out.println(num);
		}
		
		System.out.println("-------------------------------");

					// 01234
		String nome = "Tadeu";
		
		for (int i = 0; i < nome.length(); i++) {
			
			char letra = nome.charAt(i);
			System.out.print(letra + " ");
			
		}
		
		System.out.println("-------------------------------");

		
		for(int i = 0; i <= 20; i++) {			
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
			if(i == 12) {
				break;
			} 
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Número 5 encontrado!");
				continue;
			}
			System.out.println("Número: " + i);
		}
		
	}

}
