
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("TEstando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Você é menor mas pode entrar por está acompanhado");
		} else {
			System.out.println("Você tem menos de 18 anos, então não pode entrar.");
		}

	}
}
