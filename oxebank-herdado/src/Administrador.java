
public class Administrador extends Funcionario implements Autenticavel{
	private AutenticaUtil autenticador;
	
	
	public Administrador() {
		this.autenticador = new AutenticaUtil();
	}
	
	public double getBonificacao() {
		return 400;
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
