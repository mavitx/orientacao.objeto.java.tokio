package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {

	String marca;
	String modelo;
	String cor;
	Date anoFabricacao = new Date();
	Date anoModelo = new Date();
	int renavam;
	int motor;
	String tipoCambio;
	double aroRodas;
	double velocidade;
	String nomeCondutor;
	boolean ligado;
	int limiteVeloc;

	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
		}
	}

	public void desligar() {
		if (this.velocidade == 0) {
			if (this.ligado) {
				this.ligado = false;
			}
		}
	}
	
	int acelerou = 0;
	public void acelerar(double valor) {
		if (this.ligado) {
			while (this.velocidade < this.limiteVeloc || acelerou < valor) {
				acelerou += 1;
				this.velocidade += 1;
			}
		}
	}

	public void frear(double valor) {
		if (this.velocidade > 0) {
			this.velocidade -= valor;
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}
	}

	public void exibir() {
		System.out.println("Nome do Condutor: " + this.nomeCondutor);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("Modelo do Ano de: " + this.anoModelo);
		System.out.println("Numero Renavam: " + this.renavam);
		System.out.println("Tipo do Motor: " + this.motor);
		System.out.println("Tipo do Cambio: " + this.tipoCambio);
		System.out.println("Tamanho do Aro: " + this.aroRodas);
		System.out.println("Velocidade: " + this.velocidade);
	}

}
