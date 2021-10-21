package br.com.oxebank.banco.teste;

import java.sql.Ref;

import br.com.oxebank.banco.modelo.Cliente;
import br.com.oxebank.banco.modelo.Conta;
import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] refs = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(20, 10);
		refs[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(88, 10);
		refs[1] = cp1;

		Cliente cliente = new Cliente();
		
		refs[2] = cliente;
		
		ContaPoupanca outra = (ContaPoupanca) refs[1];
		
		System.out.println( outra.getNumero() );
		
		
		ContaPoupanca ref = (ContaPoupanca) refs[1]; //type cast
		
		
		System.out.println(cp1.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
