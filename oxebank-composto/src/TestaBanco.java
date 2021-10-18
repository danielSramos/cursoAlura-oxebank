
public class TestaBanco {
	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		
		daniel.nome = "Daniel Ramos";
		daniel.cpf = "07616109365";
		daniel.profissao = "progamador";
		
		Conta contaDoDaniel = new Conta();
		
		contaDoDaniel.deposita(150);
		contaDoDaniel.titular = daniel;
		System.out.println(contaDoDaniel.titular.nome);
	}
}
