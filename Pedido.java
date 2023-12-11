package FoodTruck_Maria_Alcaide;

import java.util.List;

public class Pedido {
	//atb
	private String opcaoPagamento;
	private double valorPedido;
	private boolean entregaEmCasa;
	private List<ItemPedido> itemPedido;
	
	//conts
	public Pedido() {
		
	}
	public Pedido(String OP, double VP, boolean EEC, List<ItemPedido> itemPedido) {
		this.setOpcaoPagamento(OP);
		this.setValorPedido(VP);
		this.setEntregaEmCasa(EEC);
		this.itemPedido = itemPedido;
	}
	public Pedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	//get - set
	public String getOpcaoPagamento() {
		return this.opcaoPagamento;
	}
	public void setOpcaoPagamento(String opcaoPagamento) {
		this.opcaoPagamento = opcaoPagamento;
	}
	
	public double getValorPedido() {
		return this.valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	public boolean isEntregaEmCasa() {
		return this.entregaEmCasa;
	}
	public void setEntregaEmCasa(boolean entregaEmCasa) {
		this.entregaEmCasa = entregaEmCasa;
	}
	
	public List<ItemPedido> getItemPedido() {
		return this.itemPedido;
	}
	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

}
