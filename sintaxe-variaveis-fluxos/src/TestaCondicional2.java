
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2 ;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Voc� pode entrar!");
		} else {
			System.out.println("Voc� n�o pode entrar.");
		}

	}
}