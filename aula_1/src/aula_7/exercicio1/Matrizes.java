package aula_7.exercicio1;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		lerMatriz(matriz);
		imprimirMatriz(matriz);

	}

	private static void lerMatriz(int[][] x) {
		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = random.nextInt(10, 21);
			}
		}
	}

	private static void imprimirMatriz(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
		}
	}
}
