package aula_1;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		Scanner nome = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		String usuario = "";
		int senha = 0;
		// System.out.println(nome.equals());

		int i = 0;

		while (senha != 123 && usuario.equalsIgnoreCase("administrador")) {

			System.out.println("Digite o usuario: ");
			usuario = nome.next();

			System.out.println("Digite a senha: ");
			senha = num.nextInt();

			if (usuario.equalsIgnoreCase("administrador")) {
				if (senha == 123) {
					System.out.println("Login Okay!");
				} else {
					System.out.println("Login Invalido");
				}
			} else {
				System.out.println("Login Invalido");
			}
			i++;

		}
		System.out.println("Tentativas: " + (i));

	}

}
