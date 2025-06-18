package poo;

public class Conta {

	private String conta;
	private String agencia;
	private String titular;
	private double saldo;
	
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta(String titular, double saldoInicial, String conta) {
		this.titular = titular;
		this.saldo = saldoInicial;
		this.conta = conta;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor inválido!");
		} else {
			this.saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
		}
	}
	
	public void sacar (double valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= (valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Valor inválido para saque.");
		}
	}
}
