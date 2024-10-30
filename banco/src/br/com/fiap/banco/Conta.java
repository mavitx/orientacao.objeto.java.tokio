package br.com.fiap.banco;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Conta {

	// atributos
	// variavei encapsuladas
	protected Cliente cliente;
	protected long numeroConta;
	protected double saldo;
	protected Date aberturaConta = new Date();

	// metodo construtor
	public Conta(Cliente cliente, long numeroConta, double saldo, String aberturaConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		System.out.println("Conta " + this.cliente.getNomeCliente() + " criada!");
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			this.aberturaConta = format.parse(aberturaConta);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + aberturaConta);
			e.printStackTrace();
		}
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
//
//	public long getNumeroConta() {
//		return numeroConta;
//	}
//
//	public void setNumeroConta(long numeroConta) {
//		this.numeroConta = numeroConta;
//	}
//
//	public double getSaldo() {
//		return saldo;
//	}
//
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}

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
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
		System.out.println("Valor tranferido!");
	}

	public void exibirSaldo() {
		System.out.println("=========================");
		System.out.println("Nome: " + this.cliente.getNomeCliente());
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("=========================");
	}

}
