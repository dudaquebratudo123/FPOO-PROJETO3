package FoodTruck_Maria_Alcaide;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TesteFoodTruck {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//atb food truck
		System.out.println("INSTANCIANDO O FOOD TRUCK . . . . . .");
		System.out.println("\nNome:");
		String FTn = entrada.next();
		System.out.println("Telefone:");
		int FTt = entrada.nextInt();
		System.out.println("Endereco:");
		String FTe = entrada.next();
		
		//criando clientes
		System.out.println("INSTANCIANDO CLIENTES . . . . . .");
			//1
			System.out.println("\nCLIENTE 1 . . .  ");
			System.out.println("nome: ");
			String Cn1 = entrada.next();
			System.out.println("telefone: ");
			int Ct1 = entrada.nextInt();
			System.out.println("cpf: ");
			int Cc1 = entrada.nextInt();
			System.out.println("idade: ");
			int Ci1 = entrada.nextInt();
			System.out.println("fome: ");
			String Cf1 = entrada.next();
			
			//2
			System.out.println("\nCLIENTE 2 . . . ");
			System.out.println("nome: ");
			String Cn2 = entrada.next();
			System.out.println("telefone: ");
			int Ct2 = entrada.nextInt();
			System.out.println("cpf: ");
			int Cc2 = entrada.nextInt();
			System.out.println("idade: ");
			int Ci2 = entrada.nextInt();
			System.out.println("fome: ");
			String Cf2 = entrada.next();
			
			//3
			System.out.println("\nCLIENTE 3 . . .  ");
			System.out.println("nome: ");
			String Cn3 = entrada.next();
			System.out.println("telefone: ");
			int Ct3 = entrada.nextInt();
			System.out.println("cpf: ");
			int Cc3 = entrada.nextInt();
			System.out.println("idade: ");
			int Ci3 = entrada.nextInt();
			System.out.println("fome: ");
			String Cf3 = entrada.next();
		
			//instanciando
			Cliente c1 = new Cliente(Cn1, Ct1, Cc1, Ci1, Cf1);
			Cliente c2 = new Cliente(Cn2, Ct2, Cc2, Ci2, Cf2);
			Cliente c3 = new Cliente(Cn3, Ct3, Cc3, Ci3, Cf3);
			
				//lista de clientes
				List<Cliente> cli_list = new ArrayList<Cliente>();
				cli_list.add(c1);
				cli_list.add(c2);
				cli_list.add(c3);
				
				//mostrando clientes
				System.out.println("Clientes:");
				for(Cliente vassoura : cli_list) {
					System.out.println("- " + vassoura.getNome() + " - " + vassoura.getIdade()
							+  " - " + vassoura.getTelefone() + " - " + vassoura.getCpf() + 
							"- " + vassoura.getFome());	
				}
				
		//criando funcionarios
		System.out.println("\nINSTANCIANDO FUNCIONARIOS . . . . . .");
			//1
			System.out.println("\nCOZINHEIRO . . .");
			System.out.println("nome: ");
			String Fn1 = entrada.next();
			System.out.println("telefone: ");
			int Ft1 = entrada.nextInt();
			System.out.println("cpf: ");
			int Fc1 = entrada.nextInt();
			System.out.println("idade: ");
			int Fi1 = entrada.nextInt();
			System.out.println("funcao: ");
			String Ff1 = entrada.next();
			System.out.println("salario: ");
			int Fs1 = entrada.nextInt();

			//2
			System.out.println("\nLIMPADOR . . . ");
			System.out.println("nome: ");
			String Fn2 = entrada.next();
			System.out.println("telefone: ");
			int Ft2 = entrada.nextInt();
			System.out.println("cpf: ");
			int Fc2 = entrada.nextInt();
			System.out.println("idade: ");
			int Fi2 = entrada.nextInt();
			System.out.println("funcao: ");
			String Ff2 = entrada.next();
			System.out.println("salario: ");
			int Fs2 = entrada.nextInt();
			
			//3
			System.out.println("\nCAIXA . . .");
			System.out.println("nome: ");
			String Fn3 = entrada.next();
			System.out.println("telefone: ");
			int Ft3 = entrada.nextInt();
			System.out.println("cpf: ");
			int Fc3 = entrada.nextInt();
			System.out.println("idade: ");
			int Fi3 = entrada.nextInt();
			System.out.println("funcao: ");
			String Ff3 = entrada.next();
			System.out.println("salario: ");
			int Fs3 = entrada.nextInt();
			
			//4
			System.out.println("\nMOTOBOY . . . ");
			System.out.println("nome: ");
			String Fn4 = entrada.next();
			System.out.println("telefone: ");
			int Ft4 = entrada.nextInt();
			System.out.println("cpf: ");
			int Fc4 = entrada.nextInt();
			System.out.println("idade: ");
			int Fi4 = entrada.nextInt();
			System.out.println("funcao: ");
			String Ff4 = entrada.next();
			System.out.println("salario: ");
			int Fs4 = entrada.nextInt();
			
			//instancia dos funcionarios
			Cozinheiro coz = new Cozinheiro(Fn1, Ft1, Fc1, Fi1, Ff1, Fs1);
			Limpador lim = new Limpador(Fn2, Ft2, Fc2, Fi2, Ff2, Fs2);
			Caixa cai = new Caixa(Fn3, Ft3, Fc3, Fi3, Ff3, Fs3);
			Motoboy mot = new Motoboy(Fn4, Ft4, Fc4, Fi4, Ff4, Fs4);
			
				//lista de funcionarios
				List<Funcionario> funcio_list = new ArrayList<Funcionario>();
				funcio_list.add(mot);
				funcio_list.add(cai);
				funcio_list.add(lim);
				funcio_list.add(coz);
			
					//mostrando os funcionarios da lista
					System.out.println("\nFuncionarios: ");
					for(Funcionario vassoura : funcio_list) {
						System.out.println("- " + vassoura.getNome() + " - " + vassoura.getIdade()
						+ " - " + vassoura.getFuncao() + " - " + vassoura.getTelefone() + " - " +
						vassoura.getCpf() + " - R$ " + vassoura.getSalario());
					}
					
		//inst food truck
		FoodTruck f1 = new FoodTruck(FTn, FTe, FTt, funcio_list, cli_list);
			
		//simulacao do food truck
		System.out.println("\nSIMULACAO DO FOOD TRUCK . . . . . .");
		f1.exibirInfo();
			
			//contratando funcio
			coz.serContratado();
			lim.serContratado();
			cai.serContratado();
			mot.serContratado();
			
			//abrindo o estabelecimento
			f1.abrir();
				//limpando foodtruck
				lim.executarFuncao();  
					//escolha dos produtos
					System.out.println("\nO que voce deseja comprar? \n1- Comidas \n2- Bebidas");
					int escolha1 = entrada.nextInt();
					List<ItemPedido> itensP_list = new ArrayList<ItemPedido>();
					switch(escolha1) {
					
						case(1):
							cai.mostrarCardapioC();
							int escolha2 = entrada.nextInt();
							//escolha comidas
							switch(escolha2) {
								case(1):
									System.out.println("Pote de almondegas . . .");
									System.out.println("Quantidade de itens:");
									int qtd1 = entrada.nextInt();
									//instanciando item
									ItemPedido i1 = new ItemPedido(15, qtd1 ,"pote_almondega");
									//valor
									float valor_item1 = 15 * qtd1;
									System.out.println("Valor:" + valor_item1);
									itensP_list.add(i1);
									break;
									
								case(2):
									System.out.println("Lanche Natural . . .");
									System.out.println("Quantidade de itens:");
									int qtd2 = entrada.nextInt();
									//instanciando item
									ItemPedido i2 = new ItemPedido(9, qtd2 ,"lanche_natural");
									//valor
									float valor_item2 = 9 * qtd2;
									System.out.println("Valor:" + valor_item2);
									itensP_list.add(i2);
									break;
									
								case(3):
									System.out.println("Hot Dog . . .");
									System.out.println("Quantidade de itens:");
									int qtd3 = entrada.nextInt();
									//instanciando item
									ItemPedido i3 = new ItemPedido(11, qtd3 , "hot_dog");
									//valor
									float valor_item3 = 11 * qtd3;
									System.out.println("Valor:" + valor_item3);
									itensP_list.add(i3);
									break;
									
								default:
									System.out.println("\nO item escolhido e invalido . . .");
									break;
							}
							break;//fim case1
							
						case(2):
							cai.mostrarCardapioB();
							int escolha3 = entrada.nextInt();
							//escolha bebidas
							switch(escolha3) {
								case(1):
									System.out.println("Suco de laranja . . .");
									System.out.println("Quantidade de itens:");
									int qtd4 = entrada.nextInt();
									//instanciando item
									ItemPedido i4 = new ItemPedido(7, qtd4 ,"suco_de_laranja");
									//valor
									float valor_item4 = 7 * qtd4;
									System.out.println("Valor:" + valor_item4);
									itensP_list.add(i4);
									break;
								case(2):
									System.out.println("Refrigerante . . .");
									System.out.println("Quantidade de itens:");
									int qtd5 = entrada.nextInt();
									//instanciando item
									ItemPedido i5 = new ItemPedido(10, qtd5 , "refrigerante");;
									//valor
									float valor_item5 = 10 * qtd5;
									System.out.println("Valor:" + valor_item5);
									itensP_list.add(i5);
									break;
								
								default:
									System.out.println("\nO item escolhido e invalido . . .");
									break;
							}//fim switch1
							break;//fim case2
						
						default:
							System.out.println("\nO item escolhido e invalido . . .");
							break;
					}//fim switch1
					
					
						System.out.println("Deseja mais alguma coisa? \n1-Sim \n2-Nao");
						int simOunao = entrada.nextInt();
						switch(simOunao) {
							case(1):
								System.out.println("1- Comida \n2- Bebida");
								int comidaOuBebida = entrada.nextInt();
								switch(comidaOuBebida) {
								
								case(1):
									cai.mostrarCardapioC();
									int escolha2 = entrada.nextInt();
									//escolha comidas
									switch(escolha2) {
										case(1):
											System.out.println("Pote de almondegas . . .");
											System.out.println("Quantidade de itens:");
											int qtd1 = entrada.nextInt();
											//instanciando item
											ItemPedido i1 = new ItemPedido(15, qtd1 ,"pote_almondega");
											//valor
											float valor_item1 = 15 * qtd1;
											System.out.println("Valor:" + valor_item1);
											itensP_list.add(i1);
											break;
											
										case(2):
											System.out.println("Lanche Natural . . .");
											System.out.println("Quantidade de itens:");
											int qtd2 = entrada.nextInt();
											//instanciando item
											ItemPedido i2 = new ItemPedido(9, qtd2 ,"lanche_natural");
											//valor
											float valor_item2 = 9 * qtd2;
											System.out.println("Valor:" + valor_item2);
											itensP_list.add(i2);
											break;
											
										case(3):
											System.out.println("Hot Dog . . .");
											System.out.println("Quantidade de itens:");
											int qtd3 = entrada.nextInt();
											//instanciando item
											ItemPedido i3 = new ItemPedido(11, qtd3 , "hot_dog");
											//valor
											float valor_item3 = 11 * qtd3;
											System.out.println("Valor:" + valor_item3);
											itensP_list.add(i3);
											break;
											
										default:
											System.out.println("\nO item escolhido e invalido . . .");
											break;
									}
									break;//fim case1
									
								case(2):
									cai.mostrarCardapioB();
									int escolha3 = entrada.nextInt();
									//escolha bebidas
									switch(escolha3) {
										case(1):
											System.out.println("Suco de laranja . . .");
											System.out.println("Quantidade de itens:");
											int qtd4 = entrada.nextInt();
											//instanciando item
											ItemPedido i4 = new ItemPedido(7, qtd4 ,"suco_de_laranja");
											//valor
											float valor_item4 = 7 * qtd4;
											System.out.println("Valor:" + valor_item4);
											itensP_list.add(i4);
											break;
										case(2):
											System.out.println("Refrigerante . . .");
											System.out.println("Quantidade de itens:");
											int qtd5 = entrada.nextInt();
											//instanciando item
											ItemPedido i5 = new ItemPedido(10, qtd5 , "refrigerante");;
											//valor
											float valor_item5 = 10 * qtd5;
											System.out.println("Valor:" + valor_item5);
											itensP_list.add(i5);
											break;
										
										default:
											System.out.println("\nO item escolhido e invalido . . .");
											break;
									}//fim switch1
									break;//fim case2
								
								default:
									System.out.println("\nO item escolhido e invalido . . .");
									break;
							}
								break;
							case(2):
								//se vc n quer mais naada, os processos continuam
								break;
						}
						
			
					//forma de pagamento
					System.out.println("\nQual sera a forma de pagamento?");
					System.out.println("1- Cartao de debito \n2- Cartao de credit0 \n3- Pix \n4-Dinheiro");
					int pag = entrada.nextInt();
					
					//instanciando obj pedido
					Pedido p1 = new Pedido();
					p1.setItemPedido(itensP_list);
					
				
				//anotando pedido
				cai.executarFuncao(); 
				
				//lendo o pedido
				System.out.println("\n\n-------- NOTA FISCAL --------");
				System.out.println("        --- ITENS ---");
				int itensNota = 1;
				for(ItemPedido vassoura : itensP_list) {
					System.out.println(itensNota + "- " + vassoura.getNome() + "        x" + vassoura.getQtd());
					itensNota++;
				}
				System.out.println("-----------------------------\n");
				
				//cozinhando
				coz.executarFuncao();
				
				//é delivery?
				System.out.println("Seu pedido e para entregar delivery?");
				boolean delivery = entrada.nextBoolean();
				if(delivery == true) {
					System.out.println(mot.executarFuncao());
				}else {
					System.out.println("Venha retirar seu pedido");
				}
	
				c1.comer();//comendo
				
			//fechando o estabelecimento
			lim.executarFuncao();
			f1.fechar();
	}

}
