
public class TestaSistemaInterno {
	
	
	public static void main(String[] args) {
		Gerente daniel = new Gerente();
		daniel.setSenha(22);
		
		Administrador adm = new Administrador();
		adm.setSenha(12);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(daniel);
		sistema.autentica(adm);
		
		Cliente c = new Cliente();
		c.setSenha(22);
		SistemaInterno aut = new SistemaInterno();
		aut.autentica(c);
		
		
	}
}
