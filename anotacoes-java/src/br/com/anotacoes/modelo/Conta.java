package br.com.anotacoes.modelo;

/**
 * 
 * @author Daniel Ramos
 * @version 1.0
 * 
 */

public abstract class Conta {
	
	@DoublePositivo
	protected double saldo;
	private String Titular;
	private String banco;
	private String agencia;
	private String numero;

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public String getTitular() {
		return Titular;
	}
	
	public void setTitular(String titular) {
		Titular = titular;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
}
