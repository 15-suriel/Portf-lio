package persistencia;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoMysql {

	private String ip;
	private String email;
	private String senha;
	private String nomeBD;
	private Connection conexao;
	
	public ConexaoMysql(String ip, String email, String senha, String nomeBD) {
		super();
		this.ip = ip;
		this.email = email;
		this.senha = senha;
		this.nomeBD = nomeBD;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLogin() {
		return email;
	}

	public void setLogin(String login) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeBD() {
		return nomeBD;
	}

	public void setNomeBD(String nomeBD) {
		this.nomeBD = nomeBD;
	}

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	public void abrirConexao() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String endereco = "jdbc:mysql://"+this.ip+":3306/"+this.nomeBD;
			this.conexao = (Connection) DriverManager.getConnection(endereco, this.email, this.senha);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void fecharConexao() {
		try {
			if(!this.conexao.isClosed()) {
				this.conexao.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	    
   	
   }

    
