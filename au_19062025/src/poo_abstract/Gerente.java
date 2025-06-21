package poo_abstract;

public class Gerente extends Funcionario implements Gerenciavel{

	private double salarioBase;
	private double bonus;
	
	public Gerente(String nome, String cpf, double bonus, double salarioBase) {
		super(nome, cpf);
		this.bonus = bonus;
		this.salarioBase = salarioBase;
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Salario Base: " + salarioBase);
		System.out.println("Bonus: " + bonus);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override //sobreescrever
	public void demitir(Funcionario funcionario) {
		System.out.println("Demitindo: " + funcionario.getNome());
	}
}
