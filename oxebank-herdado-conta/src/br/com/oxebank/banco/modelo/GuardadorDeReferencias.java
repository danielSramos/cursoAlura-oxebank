package br.com.oxebank.banco.modelo;

public class GuardadorDeReferencias {
	private int referenciasGuardadas;
	
	private Object[] referencias;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.referenciasGuardadas = 0;
	}
	
	public void adiciona(Object conta) {
		this.referencias[this.referenciasGuardadas] = conta;
		this.referenciasGuardadas++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.referenciasGuardadas;
	}
	
	public Object getReferencia(int pos) {
		return (Conta) this.referencias[pos];
	}
}
