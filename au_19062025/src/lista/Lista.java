package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		List<String> listaCompras = new ArrayList<>();
//		
//		listaCompras.add("Arroz"); // index 0
//		listaCompras.add("Macarão"); // index 1
//		listaCompras.add("Feijão"); // index 2
//		listaCompras.add("Cuscuz"); // index 3
//		
//		System.out.println(listaCompras);
//		
//		for (int i = 0; i < listaCompras.size(); i++) {
//			System.out.println(listaCompras.get(i));
//		}
//		
		// Classe invólucro
		/*
		 * primitivo - classe invólucro
		 * int -> Integer
		 * double -> Double
		 * float -> Float
		 * boolean -> Boolean
		 * long -> Long
		 * */
		
		List<Double> listaSalarios = new ArrayList<>();
			
//		System.out.println("Quantos salários você quer adicionar a lista: ");
//		int quantidade = scan.nextInt();
//		
//		for(int i = 0; i < quantidade; i++) {
//			System.out.printf("Digite o salário #%d: ", i + 1);
//			double salario = scan.nextDouble();
//			
//			listaSalarios.add(salario);
//		}
		
		listaSalarios.add(1555.56);
		listaSalarios.add(1200.00);
		listaSalarios.add(1500.98);
		listaSalarios.add(1000.00);
		listaSalarios.add(5666.98);
		listaSalarios.add(1500.98);
		System.out.println(listaSalarios);
		
		listaSalarios.remove(2);
		System.out.println(listaSalarios);
		
		listaSalarios.set(1, 698.0);
		
		System.out.println(listaSalarios);
		
		listaSalarios.add(1, 700.0);
		System.out.println(listaSalarios);
		
		for(int i = 0; i < listaSalarios.size(); i++) {
			System.out.println(listaSalarios.get(i) + 100);
		}
		
		
		// for each
		for (Double salario : listaSalarios) {
			System.out.println(salario + 100);
		}
	}

}
