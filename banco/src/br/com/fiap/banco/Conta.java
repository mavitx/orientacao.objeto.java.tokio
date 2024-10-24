package br.com.fiap.banco;

public class Conta {

	// atributos
	String nomeCliente;
	String cpfCliente;
	long numeroConta;
	double saldo;

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

