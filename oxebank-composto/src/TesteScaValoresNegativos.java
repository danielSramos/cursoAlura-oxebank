
public class TesteScaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(120));
		
		System.out.println(conta.getSaldo());
		
	}
}
