package FoodTruck_Maria_Alcaide;

public abstract class Pessoa {
	//atb
	private String nome;
	private int telefone;
	private int cpf;
	private int idade;
	
	//const
	public Pessoa() {
		
	}
	public Pessoa(String nome, int telefone, int cpf, int idade) {
			this.nome = nome;
			this.telefone = telefone;
			this.cpf = cpf;
			this.idade = idade;
	}
	
	//get - set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
