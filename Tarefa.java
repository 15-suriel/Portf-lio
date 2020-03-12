package model;

public class Tarefa {
    
	private long idTarefa;
	private String descricaoTarefa;
	private String categoria;
    private String dataRealizacao;
    private String dataPrevisao;
        
    public Tarefa(){    
    	super();
       }

    public Tarefa(long idTarefa, String descricaoTarefa, String categoria, String dataRealizacao, String dataPrevisao) {
        super();
        this.idTarefa = idTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.categoria = categoria;
        this.dataRealizacao = dataRealizacao;
        this.dataPrevisao = dataPrevisao;
    }
        
    public long getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(long idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }        
        
}
