package FoodTruck_Maria_Alcaide;

public class Funcionario extends Pessoa{
	//atb
	private String funcao;
	private double salario;
	
	//const
	public Funcionario() {
		
	}
	public Funcionario(String nome, int telefone, int cpf, int idade, String funcao, double salario) {
		super();
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setCpf(cpf);
		super.setIdade(idade);
		this.setFuncao(funcao);
		this.setSalario(salario);
	}
	
	//get - set
	public String getFuncao() {
		return this.funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//sobrecarga met.
	public String executarFuncao() {
		return null;
		
	}
	
	public void serContratado() {
		System.out.println("\n" + getNome() + " foi contratado para trabalhar no FoodTruck . . .");
	}
	public void serDemitido() {
		System.out.println("\n" + getNome() + " foi demitido do FoodTruck . . .");
	}
}
