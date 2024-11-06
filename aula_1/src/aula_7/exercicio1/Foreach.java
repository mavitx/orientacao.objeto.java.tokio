package aula_7.exercicio1;

import java.util.Random;

public class Foreach {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		lerArray(numeros);
		imprimirArray(numeros);

	}

	private static void lerArray(int[] x) {
		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = random.nextInt(10);
		}
	}

	// foreach
	private static void imprimirArray(int[] x) {
		for (int numero : x) {
			System.out.println(numero + "\t");
		}
	}

}
