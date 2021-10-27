package br.com.oxebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	/**
	 * @author Daniel
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero)  {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {

		return "Conta Corrente, " 
		+ super.toString()
		;
	}
}
