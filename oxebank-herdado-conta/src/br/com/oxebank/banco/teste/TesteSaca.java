package br.com.oxebank.banco.teste;
import br.com.oxebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(444, 4444);
		cc.deposita(200);

		try {
			cc.saca(210);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(cc.getSaldo());
	}

}
