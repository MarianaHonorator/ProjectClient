package oo.desafios;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		
	this.nome = nome;
	
	}
	
	
	double valortotal(){
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.valortotal();
		}
		
		return total;
	}
	
	
	
}
