package br.com.oxebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {

		Number idadeRef = Integer.valueOf(24);// Autoboxing
		System.out.println("Valor adicionado: " + idadeRef.intValue());// Unboxing

		Double dRef = Double.valueOf(3.2);
		System.out.println("Valor adicionado: " + dRef.doubleValue());

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		List<Object> lista = new ArrayList<Object>();
		lista.add(22);
		lista.add("F");
	}
}
