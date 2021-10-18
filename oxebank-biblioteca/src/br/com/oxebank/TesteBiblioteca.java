package br.com.oxebank;

import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(2222,3333);
		c.deposita(100);
		System.out.println(c.getSaldo());
	}
}
