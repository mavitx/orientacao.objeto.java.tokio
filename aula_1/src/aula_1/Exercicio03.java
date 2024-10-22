package aula_1;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome = "Maria";
		String sobrenome = "Vitoria";
		
		System.out.println(nome.length()); // quant de letras
		System.out.println(nome.equals(sobrenome)); // comparação
		System.out.println(nome.toLowerCase()); // tudo minusculo
		System.out.println(nome.toUpperCase()); // tudo maiusculo
		System.out.println(nome.trim()); 
		System.out.println(nome.replace("a", "e")); // substitui as letras
		System.out.println(nome.valueOf(10)); // troca pelo valor
		System.out.println(nome.charAt(0)); // letra dessa posição
		System.out.println(nome.formatted());
		
	}

}
