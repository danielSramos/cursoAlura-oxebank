package br.com.oxebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.oxebank.banco.modelo.Cliente;
import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Daniel");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Beatriz");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Diego");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Danilo");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Classe anonima utilizando lambda para enxugar o c?digo
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

		// Classe anonima usando lambda para enxugar o c?digo, explicitando o tipo do
		// parametro
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nome1 = c1.getTitular().getNome();
			String nome2 = c2.getTitular().getNome();
			return nome1.compareTo(nome2);
		};
		lista.sort(comp);
		lista.forEach((conta) -> System.out.println("Nome do Titular: " + conta.getTitular().getNome() + ", " + conta + ", Saldo: " + conta.getSaldo()) );
	}
}
