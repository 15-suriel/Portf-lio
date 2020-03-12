package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Tarefa;

public class TarefaDAO {

   private ConexaoMysql conexao;
   
   public TarefaDAO(){
       super();
       this.conexao = new ConexaoMysql("localhost", "root", "", "bd_projeto");
   }

    public void setConexaoMysql(ConexaoMysql conexao) {
        this.conexao = conexao;
    }
    
        public Tarefa cadastrarTarefa(Tarefa tarefa) {
            this.conexao.abrirConexao();
            String sqlInsert = "INSERT INTO tarefa(data_realizacao,data_previsao,descricao_tarefa,categoria) VALUES (?,?,?,?);";
            try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sqlInsert);
			statement.setString(1, tarefa.getDataRealizacao());
			statement.setString(2, tarefa.getDataPrevisao());
			statement.setString(3, tarefa.getDescricaoTarefa());
			statement.setString(4, tarefa.getCategoria());
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace(); 
		} finally {
			this.conexao.fecharConexao();
		}
       return null;
            
        }
}