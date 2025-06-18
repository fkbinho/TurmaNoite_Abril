package poo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite a marca do seu carro:");
//		String marca = scan.nextLine();
		
		Carro meuCarro = new Carro();
        meuCarro.modelo = "KING";
        meuCarro.ano = 2025;
        
        System.out.println("----------");
        meuCarro.exibirDados();
        
        meuCarro.ligar();
        meuCarro.desligar();

        Carro fabiCarro = new Carro();
        System.out.println(fabiCarro.marca);
        
        fabiCarro.marca = "BMW";
        fabiCarro.modelo = "i8";
        fabiCarro.ano = 2015;
        
        System.out.println("----------");
        fabiCarro.exibirDados();

        
        Carro hebertCarro = new Carro();
        hebertCarro.modelo = "F8";
        hebertCarro.ano = 2020;
        
        System.out.println("----------");
        hebertCarro.exibirDados();
        
	}
}
