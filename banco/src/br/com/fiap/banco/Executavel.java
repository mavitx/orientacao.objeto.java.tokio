package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		// instâncias
		Cliente clienteMaria = new Cliente("Maria", "2222222","Poa-SP", "20/10/2000");
		Conta contaMaria = new Conta(clienteMaria, 123456, 1000, "10/12/2024");

		Cliente clienteMateus = new Cliente("Mateus", "2333","Poa-SP", "10/10/2010");
		Conta contaMateus = new Conta(clienteMateus, 96355, 1000, "10/12/2024");
		
		Cliente clienteKayky = new Cliente("Kayky", "89898","Poa-SP", "01/01/2001");
		Conta contaKayky = new Conta(clienteKayky, 96333, 1000, "10/12/2024");
		
		// simulações
		contaMaria.depositar(2500);
		contaMateus.depositar(2500);
		contaKayky.depositar(2500);
		
		contaMaria.sacar(700);
		contaMateus.sacar(700);
		contaKayky.sacar(700);
		
		contaMaria.exibirSaldo();
		contaMateus.exibirSaldo();
		contaKayky.exibirSaldo();
		
		contaMaria.transferir(contaMateus, 200);
		contaMaria.exibirSaldo();

	}

}
