package br.com.oxebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente conta = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getAgencia());
	}

}
