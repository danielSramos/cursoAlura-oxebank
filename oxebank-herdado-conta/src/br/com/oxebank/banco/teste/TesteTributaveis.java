package br.com.oxebank.banco.teste;

import br.com.oxebank.banco.modelo.CalculadorImposto;
import br.com.oxebank.banco.modelo.ContaCorrente;
import br.com.oxebank.banco.modelo.SeguroVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 10);
		cc.deposita(100.0);
		
		SeguroVida sv = new SeguroVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}

}
