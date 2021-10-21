package br.com.oxebank.banco.teste;

import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.GuardadorDeReferencias;

public class Teste {
	public static void main(String[] args) {
		
		GuardadorDeReferencias guarda = new GuardadorDeReferencias();
		
		Conta cc1 = new ContaCorrente(10, 20);
		Conta cc2 = new ContaCorrente(30, 40);
		Conta cc3 = new ContaCorrente(50, 60);
		
		guarda.adiciona(cc1);
		guarda.adiciona(cc2);
		guarda.adiciona(cc3);
		
		System.out.println(guarda.getQuantidadeDeElementos());
		
		Conta ref = (Conta) guarda.getReferencia(1);
		
		System.out.println(ref.getNumero());
		System.out.println(ref.getAgencia());
	}
}
