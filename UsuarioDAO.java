package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioDAO {

   private ConexaoMysql conexao;
   
   public UsuarioDAO(){
       super();
       this.conexao = new ConexaoMysql("localhost", "root", "", "bd_projeto");
   }

    public void setConexaoMysql(ConexaoMysql conexao) {
        this.conexao = conexao;
    }
    
        public Usuario cadastrarUsuario(Usuario usuario) {
            this.conexao.abrirConexao();
            String sqlInsert = "INSERT INTO usuario(email, nome, senha, tipo_de_usuario) VALUES (?,?,?,?);";
            try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sqlInsert);
			statement.setString(1, usuario.getEmail());
			statement.setString(2, usuario.getNome());
			statement.setString(3, usuario.getSenha());
			statement.setString(4, usuario.getTipoDeUsuario());
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace(); 
		} finally {
			this.conexao.fecharConexao();
		}
       return null;
            
        }
        public void atualizarDados(Usuario usuario) {
		this.conexao.abrirConexao();
		String sqlUpdate = "UPDATE usuario SET nome=?, email=?, senha=? WHERE id_usuario=?;";

		try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sqlUpdate);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());
			statement.setString(3, usuario.getSenha());
			statement.setLong(4, usuario.getIdUsuario());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.fecharConexao();
		}
	}
        public void excluirContaUsuario(long id) {
            this.conexao.abrirConexao();
         String sqlDelete = "DELETE FROM usuario WHERE id_usuario=?";
         try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sqlDelete);
			statement.setLong(1, id);

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.fecharConexao();
		}
        }

    	public Usuario buscarPorId(long idUsuario) {
    		this.conexao.abrirConexao();
    		String sqlInsert = "SELECT * FROM usuario WHERE id_usuario=?;";
    		PreparedStatement statement;
    		Usuario usuario = null;
    		try {
    			statement = this.conexao.getConexao().prepareStatement(sqlInsert);
    			statement.setLong(1, idUsuario);
    			ResultSet rs = statement.executeQuery();
    			if(rs.next()) {
    				usuario = new Usuario();
    				usuario.setIdUsuario(rs.getLong("id_usuario"));
    				usuario.setNome(rs.getString("nome"));
    				usuario.setEmail(rs.getString("email"));
    				usuario.setSenha(rs.getString("senha"));
    			}
    		} catch (SQLException e) {
    			e.printStackTrace();
    		} finally {
    			this.conexao.fecharConexao();
    		}
    		return usuario;
    	}
    	
    	public ArrayList<Usuario> buscarTodos() {
    		this.conexao.abrirConexao();
    		String sqlSelect = "SELECT * FROM usuario;";
    		PreparedStatement statement;
    		Usuario usuario = null;
    		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
    		try {
    			statement = this.conexao.getConexao().prepareStatement(sqlSelect);
    			ResultSet rs = statement.executeQuery();
    			
    			while(rs.next()) {
    				usuario = new Usuario();
    				usuario.setIdUsuario(rs.getLong("id_usuario"));
    				usuario.setNome(rs.getString("nome"));
    				usuario.setEmail(rs.getString("email"));
    				usuario.setSenha(rs.getString("senha"));
    				listaUsuario.add(usuario);
    			}
    		} catch (SQLException e) {
    			e.printStackTrace();
    		} finally {
    			this.conexao.fecharConexao();
    		}
    		return listaUsuario;
    	}
    	
    	
	}



