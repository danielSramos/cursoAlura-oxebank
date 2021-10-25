package br.com.oxebank.banco.teste.util;

import java.util.ArrayList;
import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(10, 20);
//		Conta cc2 = new ContaCorrente(10, 20);
//		System.out.println("Igual? " + cc1.ehIgual(cc2));
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(10, 20);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(30, 40);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(30, 40);
		System.out.println("Existe: " + lista.contains(cc3));
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
