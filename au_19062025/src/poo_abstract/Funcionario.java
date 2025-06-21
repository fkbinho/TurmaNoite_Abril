package poo_abstract;

public abstract class Funcionario implements Pagavel {

	private String nome;
	private String cpf;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
		
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
