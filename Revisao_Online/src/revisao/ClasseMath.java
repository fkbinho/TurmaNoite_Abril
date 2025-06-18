package revisao;

public class ClasseMath {
	public static void main(String[] args) {
		
		double num1 = 10.49;
		double num2 = 4.85;
		
		System.out.println(Math.round(num1));
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.abs(-10));
		System.out.println(Math.random()); // 0.0 - 1(não incluso)
		System.out.println(Math.sqrt(16)); 
		System.out.println(Math.pow(2, 10)); // 2³
		
	}
}
