package oo.desafios;

import java.util.ArrayList;


public class Compra {


	final ArrayList<Item> itens = new ArrayList<>();
	
	
void AdicionarItens(Produto p, int qtd) {
	
	this.itens.add(new Item(p,qtd));
	

}

void AdicionarItens(String nome, double preco, int qtd) {
	var produto = new Produto(nome, preco);
	this.itens.add(new Item(produto, qtd));
	
	
}

 double valortotal(){
	double total = 0;
	
	for(Item item: itens) {
		total += item.qtd * item.produto.preco;
	}
	
	return total;
}
	



}
