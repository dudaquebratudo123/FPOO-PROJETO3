package FoodTruck_Maria_Alcaide;

public class Cliente extends Pessoa{
	//atb
	private String fome;
	
	//const
	public Cliente() {
		
	}
	public Cliente(String nome, int telefone, int cpf, int idade, String fome) {
		super();
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setCpf(cpf);
		super.setIdade(idade);
		this.setFome(fome);
	}
	
	//get - set
	public String getFome() {
		return this.fome;
	}
	public void setFome(String fome) {
		this.fome = fome;
	}
	
	//met esp.
	public void comer() {
		System.out.println("\nA pessoa " + getNome() + " esta consumindo seu pedido . . .");
	}
	public void comprar() {
		System.out.println("\nA pessoa " + getNome() + " esta fazendo sua escolha . . .");
	}
}
