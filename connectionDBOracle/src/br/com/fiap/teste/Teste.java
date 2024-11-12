package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		
//		Usuario maria = new Usuario("Maria", "maria@gmail.com");
//		Usuario mateus = new Usuario("Mateus", "mateus@gmail.com");
//		Usuario gabriel = new Usuario("Gabriel", "gabriel@gmail.com");
//		
//		 //inserindo user no banco
//		dao.insert(maria);
//		dao.insert(mateus);
//		dao.insert(gabriel);
		
		Usuario mariaUpdate = dao.selectById(24);
		mariaUpdate.setNome("Maria Silva");
		mariaUpdate.setEmail("mariavi;t@gmail.com");
		dao.update(mariaUpdate);
		
//		// buscar todos os users
//		List<Usuario> lista = new ArrayList<Usuario> ();
//		lista = dao.selectAll();
//		
//		for (Usuario usuario : lista) {
//			System.out.println("ID: " + usuario.getId());
//			System.out.println("Nome: " + usuario.getNome());
//			System.out.println("Email: " + usuario.getEmail());
//			System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
//		}
		
	}

}
