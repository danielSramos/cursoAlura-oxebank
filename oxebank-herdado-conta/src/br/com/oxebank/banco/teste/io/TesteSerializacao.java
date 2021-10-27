package br.com.oxebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.oxebank.banco.modelo.Cliente;
import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel Ramos");
		cliente.setProfissao("Dev");
		cliente.setCpf("07616109365");

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(100.20);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}
}