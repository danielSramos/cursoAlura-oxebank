package br.com.oxebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(10, 20);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(30, 40);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		
		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(50, 60);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(70, 80);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
		}
		
		//Forma simplificada de fazer um for quando se trata de retorno de objetos
		System.out.println("----------------------");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
