
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("TEstando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voc� � menor mas pode entrar por est� acompanhado");
		} else {
			System.out.println("Voc� tem menos de 18 anos, ent�o n�o pode entrar.");
		}

	}
}
