package heranca_poo;

public class Conta {	
    private String titular;
    private String agencia;
    private static int numero = 0;
    protected double saldo;

    public Conta(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        this.agencia = "0001"; // Valor padrão para agência
        numero++;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo ) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir (double valor, Conta destino) {
        if (valor > 0 && valor <= this.saldo ) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Conta.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\n"
                + "Agência: " + agencia + "\n"
                + "Número: " + numero + "\n"
                + "Saldo: R$ " + String.format("%.2f", saldo);
    }
}
