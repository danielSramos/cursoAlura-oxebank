package br.com.oxebank.banco.teste;


import br.com.oxebank.banco.modelo.Cliente;
import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(10);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(220, 10);
		ContaPoupanca cp = new ContaPoupanca(20, 30);
		Cliente client = new Cliente();
		client.setNome("Daniel");
		
		cc.setTitular(client);
		cp.setTitular(client);
		
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		
		//println();
	}

	static void println() {}
	static void println(Object ref) {}
//	static void println(int a) {}
//	static void println(boolean val) {}
//	static void println(Conta conta) {}
}
