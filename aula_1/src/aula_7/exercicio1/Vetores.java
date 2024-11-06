package aula_7.exercicio1;

public class Vetores {

	static int[] x = new int[10];
	
	public static void main(String[] args) {

		Vetores vetor = new Vetores();
		vetor.lerVetor(x);
		vetor.imprimirVetor(x);
		
	}

	//metodos
	private void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}

	private void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + "\t");
		}
	}

}