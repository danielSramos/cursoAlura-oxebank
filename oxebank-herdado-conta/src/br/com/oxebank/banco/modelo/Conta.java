package br.com.oxebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa o modelo de uma conta
 * 
 * @author Daniel Ramos
 * @Version 0.1
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("Total de contas criadas: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Criando uma nova conta.");
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N?o pode numero menore ou iguais a zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia < 0) {
			System.out.println("N?o pode numero menos ou igual a zero.");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return total;
	}

	@Override
	public boolean equals(Object conta) {

		Conta novaRef = (Conta) conta;

		if (this.agencia != novaRef.agencia) {
			return false;
		}
		if (this.numero != novaRef.numero) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.agencia + " Numero: " + this.numero;
	}
	
	@Override
	public int compareTo(Conta conta) {
		return Double.compare(this.saldo, conta.saldo);
	}
}
