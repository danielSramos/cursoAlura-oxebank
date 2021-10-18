
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setNome("Daniel");
		g1.setCpf("9387747884");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println("Bonificação " + g1.getBonificacao());
		
		g1.setSenha(10);
		
		boolean autenticou = g1.autentica(10);
		System.out.println(autenticou);
	}

}
