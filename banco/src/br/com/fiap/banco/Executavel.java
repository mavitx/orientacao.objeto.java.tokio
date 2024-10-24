package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		// instâncias
		Conta contaMaria = new Conta();
		contaMaria.nomeCliente = "Maria";
		Conta contaMateus = new Conta();
		contaMateus.nomeCliente = "Mateus";
		Conta contaKayky = new Conta();
		contaKayky.nomeCliente = "Kayky";
		
		// simulações
		contaMaria.depositar(2500);
		contaMateus.depositar(2500);
		contaKayky.depositar(2500);
		
		contaMaria.sacar(800);
		contaMateus.sacar(700);
		contaKayky.sacar(700);
		
		contaMaria.exibirSaldo();
		contaMateus.exibirSaldo();
		contaKayky.exibirSaldo();
		
		contaMaria.transferir(contaMateus, 200);
		
	}

}
