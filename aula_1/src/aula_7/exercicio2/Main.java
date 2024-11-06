package aula_7.exercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		List<Usuario> listaUsers = new ArrayList<Usuario>();
		listaUsers.add(new Usuario(5, "Gabriel", "1592684"));
		listaUsers.add(new Usuario(2, "Mateus", "aaaaa"));
		listaUsers.add(new Usuario(4, "Vinicius", "haha"));
		listaUsers.add(new Usuario(3, "Kayky", "963"));
		listaUsers.add(new Usuario(1, "Maria", "senha"));

		System.out.println("Lista dos Usuarios: ");
		for (Usuario usuario : listaUsers) {
			System.out.println(usuario.getNome());
		}

		System.out.println(" ");

		Collections.sort(listaUsers);

		System.out.println("Lista Ordenada dos Usuarios: ");
		for (Usuario usuario : listaUsers) {
			System.out.println(usuario.getNome());
		}

		System.out.println("Removendo Usuario");
		remove("Vinicius", listaUsers);
		for (Usuario usuario : listaUsers) {
			System.out.println(usuario.getNome());
		}

	}

	public static List<Usuario> remove(String nome, List<Usuario> lista) {
		Iterator<Usuario> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return lista;
	}
	
}
