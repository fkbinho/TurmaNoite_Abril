package poo_abstract;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario marco = new Estagiario("Marco", "1234567890", 120);

		System.out.println("===== ESTAGIARIO =====");
		marco.exibirInfo();
		System.out.println("R$ " + marco.calcularSalario());
		
		Gerente eli = new Gerente("Elizangela", "9876543210", 3500.00, 1000.00);

		System.out.println("===== Gerente =====");
		eli.exibirInfo();
		System.out.println("R$ " + eli.calcularSalario());
		eli.demitir(marco);
	}

}
