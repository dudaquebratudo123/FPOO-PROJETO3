package FoodTruck_Maria_Alcaide;

public class Caixa extends Funcionario{
	//const
	public Caixa() {
			
	}
	public Caixa(String nome, int telefone, int cpf, int idade, String funcao, double salario) {
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
		System.out.println("O caixa " + getNome() + " esta anotando seu pedido . . . ");
		return null;
	}
	
	public void mostrarCardapioC() {
		System.out.println("Comidas . . .");
		System.out.println("1 - Pote de almondegas, por R$ 15,00");
		System.out.println("2 - Lanche natural, por R$ 9,00");
		System.out.println("3 - Hot-dog, por R$ 11,00");
	}
	public void mostrarCardapioB() {
		System.out.println("Bebidas . . .");
		System.out.println("1 - Suco de laranja, por R$ 7,00");
		System.out.println("2 - Refrigerante, por R$ 10,00");
	}
}
