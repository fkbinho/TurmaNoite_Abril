package heranca_poo;

public class ContaCorrente extends Conta {
	public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo ) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "==== Conta Corrente ====\n"
                + super.toString();
    }
}
