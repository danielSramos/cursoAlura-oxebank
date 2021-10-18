
public class SistemaInterno {

	private int senha = 22;
	
	public void autentica(Autenticavel fa) {
		if (fa.autentica(this.senha)) {
			System.out.println("Login com sucesso!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
}
