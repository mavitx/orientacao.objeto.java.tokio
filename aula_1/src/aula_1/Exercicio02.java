package aula_1;

public class Exercicio02 {

	public static void main(String[] args) {
		
		byte numeroByte = 5;
		short numeroShort = 100;
		int numeroInt = 1000;
		long numeroLong = 100000000000000000l;
		float numeroFloat = 5.472222222f;
		double numeroDouble = 5.222222222222222222;
		char caracter = 'E';
		boolean tipoBool = 10 > 5;
		
		numeroInt = (int) numeroFloat;
		numeroByte = (byte) numeroInt;
		numeroFloat = (float) numeroShort;
		numeroShort = (short) numeroLong;
		numeroDouble = (double) numeroFloat;
		numeroLong = (long) numeroInt;
		
		System.out.println("Numero Byte: " + numeroByte);
		System.out.println("Numero Short: " + numeroShort);
		System.out.println("Numero Int: " + numeroInt);
		System.out.println("Numero Long: " + numeroLong);
		System.out.println("Numero Float: " + numeroFloat);
		System.out.println("Numero Double: " + numeroDouble);
		System.out.println("Caracter: " + caracter);
		System.out.println("Booleano: " + tipoBool);

	}

}
