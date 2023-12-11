package FoodTruck_Maria_Alcaide;

public class Limpador extends Funcionario{
	//const
	public Limpador() {
		
	}
	public Limpador(String nome, int telefone, int cpf, int idade, String funcao, double salario) {
		super();
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setCpf(cpf);
		super.setIdade(idade);
		super.setFuncao(funcao);
		super.setSalario(salario);
	}
	
	//met
	@Override
	public String executarFuncao() {
		System.out.println("\nO faxineiro " + getNome() + " esta limpando o estabelecimento . . . ");
		return null;
	}
}
