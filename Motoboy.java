package FoodTruck_Maria_Alcaide;

public class Motoboy extends Funcionario{
	//const
	public Motoboy() {
		
	}
	public Motoboy(String nome, int telefone, int cpf, int idade, String funcao, double salario) {
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
		System.out.println("O motoboy " + getNome() + " esta saindo do estabelecimento "
				+ "para entregar seu pedido . . . ");
		return null;

	}
}
