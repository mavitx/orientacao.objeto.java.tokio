package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// instancias

		Carro carro = new Carro();
		carro.nomeCondutor = "Maria";
		carro.marca = "FIAT";
		carro.modelo = "Uno";
		carro.cor = "Vermelho";
		carro.renavam = 123;
		carro.motor = 12;
		carro.tipoCambio = "Automatico";
		carro.aroRodas = 30;
		carro.velocidade = 80;
		carro.ligado = true;
		carro.limiteVeloc = 200;

		carro.ligar();
		carro.desligar();
		carro.acelerar(70);
		carro.frear(20);
		carro.exibir();

		System.out.println("======================================");
		
		// instanciando
		Caminhao caminhao = new Caminhao();
		caminhao.marca = "Mercedes";
		caminhao.modelo = "Bens";
		caminhao.cor = "Vermelho";
		caminhao.tipoCambio = "Automatico";
		caminhao.tipoCarga = "Arroz";
		caminhao.nomeCondutor = "Maria";
		caminhao.renavam = 369369369;
		caminhao.motor = 13;
		caminhao.eixos = 60;
		caminhao.limiteVeloc = 180;
		caminhao.aroRodas = 3.3;
		caminhao.velocidade = 90;
		caminhao.limiteCarga = 500;
		caminhao.qtdCarga = 0;
		caminhao.ligado = true;

		// simulações
		caminhao.ligar();
		caminhao.desligar();
		caminhao.acelerar(70);
		caminhao.frear(20);
		caminhao.carregar(400);
		caminhao.descarregar(200);
		caminhao.exibir();
	}

}
