
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Daniel");
		g1.setSalario(5000.0);
		
		EditorVideo editor = new EditorVideo();
		editor.setNome("Diego");
		editor.setSalario(2500.0);
		
		Designer design = new Designer();
		editor.setNome("Danilo");
		editor.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(editor);
		controle.registra(design);

		System.out.println(controle.getSoma());
		

	}

}
