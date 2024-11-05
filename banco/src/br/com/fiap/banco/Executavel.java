package br.com.fiap.banco;

import br.com.fiap.banco.cliente.Cliente;
import br.com.fiap.banco.conta.ContaCorrente;
import br.com.fiap.banco.produto.CDB;
import br.com.fiap.banco.produto.LCA;
import br.com.fiap.banco.produto.LCI;

public class Executavel {

	public static void main(String[] args) throws SaldoInsuficiente {

		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();

		// instâncias
		Cliente clienteMaria = new Cliente("Maria", "2222222", "Poa-SP", "20/10/2000");
		ContaCorrente contaMaria = new ContaCorrente(clienteMaria, 123456, 1000, "10/12/2024");

		Cliente clienteMateus = new Cliente("Mateus", "2333", "Poa-SP", "10/10/2010");
		ContaCorrente contaMateus = new ContaCorrente(clienteMateus, 96355, 1000, "20/12/2024");

		Cliente clienteKayky = new Cliente("Kayky", "89898", "Poa-SP", "01/01/2001");
		ContaCorrente contaKayky = new ContaCorrente(clienteKayky, 96333, 1000, "30/12/2024");

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

		// transferir
		contaMaria.transferir(contaMateus, 200);
		contaMaria.exibirSaldo();
		contaMateus.exibirSaldo();

		// investimento
		contaMateus.investimento(cdb, 100);
		contaMateus.exibirSaldo();

		contaMaria.investimento(lci, 150);
		contaMaria.exibirSaldo();

		contaKayky.investimento(lca, 200);
		contaKayky.exibirSaldo();

		try {
			contaMaria.sacar(1000);
		} catch (SaldoInsuficiente e1) {
			e1.printStackTrace();
		}
	}

}
