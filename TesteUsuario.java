package teste;

import java.util.ArrayList;
import model.Usuario;
import persistencia.UsuarioDAO;

public class TesteUsuario {
	public static void main(String[] args) {
		
// CADASTRAR USUARIO
		
		Usuario usuario = new Usuario();
		usuario.setEmail("oioioit@gmail.com");
		usuario.setNome("Thor");
		usuario.setSenha("123456");
  		usuario.setTipoDeUsuario("lider");
		
		UsuarioDAO uDAO = new UsuarioDAO();
		
		uDAO.cadastrarUsuario(usuario); 
	
// EDITAR 
	 /*
		Usuario usuario = new Usuario();
		usuario.setEmail("lalla@gmail.com");
		usuario.setNome("Thor");
		usuario.setSenha("4444");
  		usuario.setTipoDeUsuario("liderado");
  		usuario.setIdUsuario(3);
  		
  		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.atualizarDados(usuario);  
		System.out.println("Os dados foram atualizados");
		*/
		
	
// EXCLUIR 
	/*	
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.excluirContaUsuario(5);   
		*/
// BUSCAR POR ID USUARIO
		
	/*	UsuarioDAO uDAO = new UsuarioDAO();
		Usuario usuario = (Usuario) uDAO.buscarPorId(3);
		System.out.println("Usuario buscado por ID: " + usuario.getNome()); */
	

// BUSCAR TODOS USUARIOS

	/*	UsuarioDAO uDAO = new UsuarioDAO();
		ArrayList<Usuario> listaUsuario = uDAO.buscarTodos();
		System.out.println("Lista de usuarios: ");
		for(int i = 0; i < listaUsuario.size(); i++) {
			System.out.println(((Usuario) listaUsuario.get(i)).getNome());
		} */
	}  
}