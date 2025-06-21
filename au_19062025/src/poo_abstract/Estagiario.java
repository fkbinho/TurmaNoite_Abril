package poo_abstract;

public class Estagiario extends Funcionario {

	private int quantidadeHoras;
	private double valorHora = 18.0;
	
	public Estagiario(String nome, String cpf,
			int quantidadeHoras) {
		super(nome, cpf);
		this.quantidadeHoras = quantidadeHoras;
	}


	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Valor - hora: " + valorHora);
		System.out.println("Qtd Horas: " + quantidadeHoras);
	}


	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}


}
