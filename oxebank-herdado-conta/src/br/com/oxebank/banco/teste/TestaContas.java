package br.com.oxebank.banco.teste;

import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.ContaPoupanca;
import br.com.oxebank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		//Full Qualified Name - FQN 
		ContaCorrente cc = new ContaCorrente(32, 9722);
		cc.deposita(500.0);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(35, 44993);
		cp.deposita(300);
		System.out.println(cp.getSaldo());
		
		cc.transfere(30, cp);
		
		System.out.println("Corrente " + cc.getSaldo());
		System.out.println("Poupanca " + cp.getSaldo());
		
	}

}
