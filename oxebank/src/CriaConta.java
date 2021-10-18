
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		
		System.out.println("Conta 1: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Conta 2: " + segundaConta.saldo);
		
		
		System.out.println("Saldo conta 1: " + primeiraConta.saldo);
		System.out.println("Saldo conta 2: " + segundaConta.saldo);
		
		
	}
}
