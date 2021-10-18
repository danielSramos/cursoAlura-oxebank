
//contrato autenticavel
	//quem assina o contrato precisa implementar:
		//Metodo setSenha
		//Metodo autentica

public abstract interface Autenticavel {
	
	public abstract boolean autentica(int senha);
	
	public abstract void setSenha(int senha);
}
