package br.com.oxebank.banco.modelo;

public class SeguroVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}
}
