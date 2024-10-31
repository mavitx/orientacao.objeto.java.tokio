package br.com.fiap.banco.conta;

import br.com.fiap.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {
	
//	private double saldoInvestimento;

	public ContaPoupanca(Cliente cliente, long numeroConta, double saldo, String aberturaConta) {
		super(cliente, numeroConta, saldo, aberturaConta);
		
	}

	@Override
	public void exibirSaldo() {
//		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("=========================");
		System.out.println("Nome: " + this.cliente.getNomeCliente());
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("=========================");
	}

}
