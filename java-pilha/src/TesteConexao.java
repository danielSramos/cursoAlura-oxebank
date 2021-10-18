
public class TesteConexao {

	public static void main(String[] args) {


		try (Conexao conect = new Conexao()) {
			conect.leDados();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		// --------------------------------------------------
 
//		Conexao cx = null;
//
//		try {
//			cx = new Conexao();
//			cx.leDados();
//
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro na conexao");
//
//		} finally {
//			// Sempre é executado no try - catch
//			// O finally é opcional, mas quando chamado ele executa o que tiver dentro
//			// independente de excessao ou nao
//			cx.close();
//		}

	}

}
