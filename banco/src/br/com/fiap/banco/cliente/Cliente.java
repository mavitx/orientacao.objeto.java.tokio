package br.com.fiap.banco.cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	// atributos
	// variavei encapsuladas
	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente; 
	private Date dtNascCliente = new Date();

	// construtor
	public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String dtNascCliente) {

		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			this.dtNascCliente = format.parse(dtNascCliente);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + dtNascCliente);
			e.printStackTrace();
		}
	}

	// metodos getters e setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public Date getDtNascCliente() {
		return dtNascCliente;
	}

	public void setDtNascCliente(Date dtNascCliente) {
		this.dtNascCliente = dtNascCliente;
	}

}
