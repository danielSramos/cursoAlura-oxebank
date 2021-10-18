
// a classe gerente herda de funcionario e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticaUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}

	public double getBonificacao() {
		return super.getSalario();
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
