package aula_1;

public class Homework06 {

	public static void main(String[] args) {

		double totalCompras = 100;
		String cupom = "DESCONTO10";

		if (totalCompras > 500 || cupom.equalsIgnoreCase("DESCONTO10")) {
			double desconto = totalCompras * 0.1;
			totalCompras = totalCompras - desconto;
			System.out.println("Desconto de: R$" + desconto);
			System.out.println("Valor total da compra de: R$" + totalCompras);
		} else {
			System.out.println("Nao ganhou desconto");
		}
		
	}

}
