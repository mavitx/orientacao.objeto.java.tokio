package aula_8.exercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Exercicio3 {

	public static void main(String[] args) { 
		
		//ArrayList
		Collection<Integer> lista = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto ArrayList: " + tempo + " milissegundos.");
		System.out.println("");
		
		//hashSet
		Collection<Integer> lista2 = new LinkedHashSet<Integer>();
		
		long inicio2 = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			lista.add(i);
		}
		
		long fim2 = System.currentTimeMillis();
		
		long tempo2 = fim2 - inicio2;
		
		System.out.println("Tempo gasto hashSet: " + tempo2 + " milissegundos.");
		System.out.println("");
		
		//LinkedList
		Collection<Integer> lista3 = new LinkedList<Integer>();
		
		long inicio3 = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			lista.add(i);
		}
		
		long fim3 = System.currentTimeMillis();
		
		long tempo3 = fim3 - inicio3;
		
		System.out.println("Tempo gasto LinkedList: " + tempo3 + " milissegundos.");
	}
	
}
