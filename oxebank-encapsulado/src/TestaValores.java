
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(54, 27372);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(53, 27272);
		Conta conta3 = new Conta(51, 27172);
		System.out.println(Conta.getTotal());
	}
}
