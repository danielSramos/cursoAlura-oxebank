 package br.com.oxebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
	
		int[] idades = new int[70];
		
		for(int i = 0; i <= 5; i++) {
			idades[i] += i * 2;
			System.out.println(idades[i]);
		}
		System.out.println(idades.length);
	}

}
