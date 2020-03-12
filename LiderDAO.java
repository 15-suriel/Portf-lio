package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Tarefa;

public class LiderDAO extends UsuarioDAO{
    
    private ConexaoMysql conexao;
    
    public LiderDAO(){
       super();
       this.conexao = new ConexaoMysql("localhost", "root", "", "bd_projeto");
   }

    @Override
    public void setConexaoMysql(ConexaoMysql conexao) {
        this.conexao = conexao;
    }
    
     public void adicionarTarefa(Tarefa tarefa){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO tarefa(data_realizacao,data_previsao,descricao_tarefa,categoria) VALUES(?,?,?,?,?)";
       try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sql);
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
	}
     
     public void excluirTarefa(long id){
         this.conexao.abrirConexao();
         String sqlDelete = "DELETE FROM tarefa WHERE id_tarefa=?";
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
    
}
     
