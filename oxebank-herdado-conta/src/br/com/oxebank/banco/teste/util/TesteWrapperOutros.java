package br.com.oxebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperOutros {
	public static void main(String[] args) {

		int idade = 24;
		Integer idadeRef = Integer.valueOf(24);//Autoboxing
		System.out.println("Valor adicionado: "+ idadeRef.intValue());//Unboxing
		
		//String s = args[0];
		//Integer num = Integer.valueOf(s);
		//int numero = Integer.parseInt(s);
		//System.out.println(numero + 2);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(24);//Autoboxing
		
		numeros.add(idadeRef);
		
	}
}
