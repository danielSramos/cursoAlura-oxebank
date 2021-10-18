
//Não pode instanciar essa classe, porque agora ela é abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	//metodo sem corpo, nao ha implementacao aqui
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
