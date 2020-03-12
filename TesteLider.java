package teste;

import model.Tarefa;
import persistencia.LiderDAO;

public class TesteLider {
	public static void main(String[] args) {
			
//	ADICIONAR TAREFA
		
		Tarefa tarefa = new Tarefa();
		tarefa.setDataRealizacao("28 de novembro");
		tarefa.setDataPrevisao("28 de novembro");
		tarefa.setDescricaoTarefa("Realizar tarefa o mais rápido possível");
  		tarefa.setCategoria("Agilidade");
		
		LiderDAO lDAO = new LiderDAO();
		
		lDAO.adicionarTarefa(tarefa); 
		
// EXCLUIR TAREFA
		/*
		LiderDAO lDAO = new LiderDAO();
		lDAO.excluirTarefa(1);  */
	}
}