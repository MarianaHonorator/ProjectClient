package oo.desafios;

public class clienteTest {
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		Compra compra1 = new Compra();
		
	compra1.AdicionarItens("Caneta", 9.67, 100);
	compra1.AdicionarItens("Notebook", 1897.88, 2);

		
	}

}
