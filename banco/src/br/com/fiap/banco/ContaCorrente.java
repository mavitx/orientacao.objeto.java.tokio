package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;
	
	public ContaCorrente(Cliente cliente, long numeroConta, double saldo, String aberturaConta) {
		super(cliente, numeroConta, saldo, aberturaConta);
	}

}
