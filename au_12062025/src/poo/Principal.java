package poo;

public class Principal {

	public static void main(String[] args) {
	
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma(10.8, 12.9));
		
		System.out.println(calc.soma(10, 12,5));
		
//		System.out.println(calc.soma(10.5, 12.8));
	
		
		
		Conta c1 = new Conta("Tadeu");

		c1.setAgencia("0045");
		c1.setConta("111-2");
		c1.setTitular("Tadeu");
		c1.setSaldo(100.0);

		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Conta: " + c1.getConta());
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());

		System.out.println("---------------------");

		Conta c2 = new Conta("Fabi", 100.0);
		System.out.println("Titular: " + c2.getTitular());
		System.out.println("Saldo: " + c2.getSaldo());
		System.out.println("Conta: " + c2.getConta());

		System.out.println("---------------------");

		Conta c3 = new Conta("Hebert", 50.0, "12345");
		System.out.println("Titular: " + c3.getTitular());
		System.out.println("Saldo: " + c3.getSaldo());
		System.out.println("Conta: " + c3.getConta());

		System.out.println("---------------------");
		c2.depositar(230.0);
		System.out.println("(Fabi) Saldo: " + c2.getSaldo());

		System.out.println("---------------------");
		c3.depositar(200.0);
		c3.sacar(195.0);
		System.out.println("(Hebert) Saldo: " + c3.getSaldo());

	}

}