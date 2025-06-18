package poo;

public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor = "Preto";
	
	public Carro () {
		this.marca = "BYD";
	}
	
	void exibirDados() {
		System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
	}
	
	void ligar() {
		System.out.println("O carro está ligado!");
	}
	
	void desligar() {
		System.out.println("O carro está desligado!");
	}
}
