
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Daniel");
		funcionario.setCpf("737727373737");
		funcionario.setSalario(3000);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		
		System.out.println(funcionario.getBonificacao());
	}
}
