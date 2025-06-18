package heranca_poo;

public class Principal {
	public static void main(String[] args) {
		ContaPoupanca marco = new ContaPoupanca("Marco",1000.0);
        System.out.println(marco);

        System.out.println(marco.getTitular());

        ContaCorrente eli = new ContaCorrente("Eli", 2000.0);
        System.out.println(eli);
        System.out.println("------------------------");

        System.out.println("Depositando R$ 299.50 na conta do Marco:");
        marco.depositar(299.50);
        System.out.println("------------------------");

        System.out.println("Sacando R$ 100.00 da conta do Eli:");
        eli.sacar(100.00);

        System.out.println("Transferindo R$ 500.00 da conta do Marco para a conta do Eli:");
        marco.transferir(500.00, eli);

        System.out.println(marco);
        marco.rendimento();
        System.out.println("Apos redimento.");
        System.out.println("------------------------");
        System.out.println(eli);
        System.out.println(marco);



//        Conta tadeu = new Conta("Tadeu", 100.0);
//        System.out.println(tadeu);
//        System.out.println("------------------------");
//        Conta maria = new Conta("Maria", 500.0);
//        System.out.println(maria);
//        System.out.println("------------------------");
//        Conta joao = new Conta("João", 1000.0);
//        System.out.println(joao);
//
//        joao.transferir(200.0, tadeu);
//        System.out.println("------------------------");
//        System.out.println("Após transferência:");
//        System.out.println(tadeu);
//        System.out.println(joao);
	}
}
