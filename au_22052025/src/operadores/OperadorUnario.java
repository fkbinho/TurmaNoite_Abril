package operadores;

public class OperadorUnario {

	public static void main(String[] args) {
		
		int x = 1;

		// x++ ou ++x ==>  x = x + 1;
		System.out.println(x++);// 2, 1
		System.out.println(x);   // 2, 1
		System.out.println(++x); // 3
		System.out.println(x++); 

		int y = 2;
		
		// y-- ou --y ==>  y = y - 1; 
		System.out.println(--y); // 1, 0
		System.out.println(y);   // 1,
		System.out.println(y--); // 1, 0 
		System.out.println(y);
		
		
		
		int a = 10;
		int b = 20;
		
		//					10 +  19 +  11 -  19    11
		System.out.println(a++ + --b + a++ - b-- + --a); //22
	}

}
