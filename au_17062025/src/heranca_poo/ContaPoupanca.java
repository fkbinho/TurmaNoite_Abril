package heranca_poo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

    public void rendimento(){
        saldo = saldo + (saldo * 0.01);

    }

    @Override
    public String toString() {
        return "==== Conta Poupança ====\n"
                + super.toString();
    }
}
