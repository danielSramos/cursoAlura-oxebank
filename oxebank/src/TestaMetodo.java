
public class TestaMetodo {
	public static void main(String[] args) {
		boolean result;
		
		//Instanciando uma nova conta
		Conta contaDoDaniel = new Conta();
		Conta contaDaBeatriz = new Conta();
		
		//Depositando valores na conta do Daniel
		contaDoDaniel.deposita(123);
		
		//Depositando valores na conta da Beatriz
		contaDaBeatriz.deposita(1200);
		
		//Sacando um valor e monstrando saldo da conta após o saque
		result = contaDoDaniel.saca(100);
		if(result) {
			System.out.println("Seu saldo é: " + contaDoDaniel.saldo);
		} else {
			System.out.println("Você não tem dinheiro suficiente");
		}
		
		//Fazendo uma transferência
		if (contaDaBeatriz.transfere(400, contaDoDaniel)) {
			System.out.println("Transferência realizada com sucesso.");
			System.out.println("Saldo atual: " + contaDaBeatriz.saldo);
		} else {
			System.out.println("Erro na transferência.");
		}
		
		System.out.println(contaDoDaniel.saldo);
		
	}
}
