package aula_1;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {

		// exercicio 3
		Scanner metal = new Scanner(System.in);
		
		System.out.println("Digite o metal 1: ");
		Double metal1 = metal.nextDouble();
		
		System.out.println("Digite o metal 2: ");
		Double metal2 = metal.nextDouble();
		
		System.out.println("Digite o metal 3: ");
		Double metal3 = metal.nextDouble();
		
		if ((metal1 > metal2) && (metal1 > metal3)) {
			System.out.println("O metal mais pesado é o metal 1: " + metal1);
		} else if (metal2 > metal3) {
			System.out.println("O metal mais pesado é o metal 2: " + metal2);
		} else {
			System.out.println("O metal mais pesado é o metal 3: " + metal3);
		}

	}

}
