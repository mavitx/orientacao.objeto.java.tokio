package br.com.fiap.banco.conta;

import br.com.fiap.banco.SaldoInsuficiente;
import br.com.fiap.banco.cliente.Cliente;
import br.com.fiap.banco.produto.Produto;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, long numeroConta, double saldo, String aberturaConta) {
		super(cliente, numeroConta, saldo, aberturaConta);
	}

	// metodo investir
	public void investimento(Produto produto, double valor) throws SaldoInsuficiente {
		if (this.sacar(valor)) {
			this.saldoInvestimento += produto.investir(valor); // polimorfismo
		}
	}

	@Override
	public void exibirSaldo() {
		System.out.println("=========================");
		System.out.println("Nome: " + this.cliente.getNomeCliente());
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Saldo de Investimento: " + this.saldoInvestimento);
		System.out.println("Saldo Total: " + (this.saldo + this.saldoInvestimento));
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("=========================");
	}

}
