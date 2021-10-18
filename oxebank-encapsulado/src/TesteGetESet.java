
public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(33, 444);
		
		conta.setNumero(7722);
		
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		//conta.titular = daniel;
		
		conta.setTitular(daniel);
		daniel.setNome("Daniel");

		System.out.println(conta.getTitular().getNome());
		
	}
}
