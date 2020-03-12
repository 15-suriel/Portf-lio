package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Tarefa;

public class LideradoDAO extends UsuarioDAO {
    
    private ConexaoMysql conexao;
    
    public LideradoDAO(){
       super();
       this.conexao = new ConexaoMysql("localhost", "root", "", "compubras");
   }

    @Override
    public void setConexaoMysql(ConexaoMysql conexao) {
        this.conexao = conexao;
    
    }
    
    public void realizarTarefa(Tarefa tarefa){
         this.conexao.abrirConexao();
         String sqlSelect = "SELECT FROM tarefa WHERE id_tarefa=?";
         try {
			PreparedStatement statement = this.conexao.getConexao().prepareStatement(sqlSelect);
			statement.setLong(1, tarefa.getIdTarefa());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexao.fecharConexao();
		}
     }
    
}