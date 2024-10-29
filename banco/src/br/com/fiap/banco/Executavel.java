package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		// instâncias
		Conta contaMaria = new Conta(222222222, "Maria", "123456");
		Conta contaMateus = new Conta(22222, "Mateus", "963852");
		Conta contaKayky = new Conta(966666, "Kayky", "852852");
		contaMaria.setSaldo(1000);

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
