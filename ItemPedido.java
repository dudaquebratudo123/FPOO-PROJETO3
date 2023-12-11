package FoodTruck_Maria_Alcaide;

public class ItemPedido {
	//atb
	private String nome;
	private double preco;
	private int qtd;
	
	//const
	public ItemPedido() {
		
	}
	public ItemPedido(double preco, int qtd, String nome) {
		this.setPreco(preco);
		this.setQtd(qtd);
		this.setNome(nome);
	}
	public ItemPedido(double preco,String nome){
		this.setPreco(preco);
		this.setNome(nome);
	}
	
	//get - set
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		return this.qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
