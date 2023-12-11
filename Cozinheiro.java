package FoodTruck_Maria_Alcaide;

public class Cozinheiro extends Funcionario{
	//const
	public Cozinheiro() {
			
	}
	public Cozinheiro(String nome, int telefone, int cpf, int idade, String funcao, double salario) {
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
		System.out.println("O chef " + getNome() + " esta preparando seu pedido . . . ");
		return null;
	}
}
