package FoodTruck_Maria_Alcaide;

import java.util.List;

public class FoodTruck {
	//atb
	private String nome;
	private int telefone;
	private String endereco;
	private List<Funcionario> funcionarios;
	private List<Cliente> clientes;
	
	//conts
	public FoodTruck() {
		
	}
	public FoodTruck(String nome, String endereco, int telefone, List<Funcionario> funcionarios, List<Cliente> clientes) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.funcionarios = funcionarios;
		this.clientes = clientes;
	}
	public FoodTruck(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
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
	
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Funcionario> getFuncionario() {
		return this.funcionarios;
	}
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionarios = funcionario;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	//met esp
	public void abrir() {
		System.out.println("\nO food truck " + getNome() + " esta abrindo no momento . . .");
	}
	public void fechar() {
		System.out.println("\nO food truck " + getNome() + " esta fechando no momento . . .");
	}
	public void exibirInfo() {
		System.out.println(getNome() + "\nTelefone:" + getTelefone() + "\nEndereco:" + getEndereco());
	}
}
