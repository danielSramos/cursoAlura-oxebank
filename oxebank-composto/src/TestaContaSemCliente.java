
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaCliente = new Conta();
		System.out.println(contaCliente.getSaldo());
		
		contaCliente.titular = new Cliente();
		System.out.println(contaCliente.titular);
		
		contaCliente.titular.nome = "Beatriz";
		System.out.println(contaCliente.titular.nome);
	}
}
