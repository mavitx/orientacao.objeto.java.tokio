package br.com.fiap.banco;

public class Conta {

	// atributos
	private String nomeCliente, cpfCliente;
	private long numeroConta;
	private double saldo;

	// metodo construtor 
	public Conta(long numeroConta, String nomeCliente, String cpfCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		System.out.println("Conta " + this.nomeCliente + " criada!");
	}
	
//	public String getNomeCliente() {
//		return nomeCliente;
//	}
//
//
//	public void setNomeCliente(String nomeCliente) {
//		this.nomeCliente = nomeCliente;
//	}
//
//
//	public String getCpfCliente() {
//		return cpfCliente;
//	}
//
//
//	public void setCpfCliente(String cpfCliente) {
//		this.cpfCliente = cpfCliente;
//	}


	public long getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	// metodos
	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			saldo = saldo - valor;
			return true;
		}
		System.out.println("Valor de saque inválido ou insuficiente.");
		return false;
	}

	public void depositar(double valor) {
			saldo = saldo + valor;
	}

	public void transferir(Conta conta, double valor) {
		if(this.sacar(valor)) {
			conta.depositar(valor);
		}
	}

	public void exibirSaldo() {
		System.out.println("=========================");
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("=========================");
	}

}

