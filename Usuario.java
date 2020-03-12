package model;

public class Usuario {
	private long idUsuario;
	private String email;
    private String nome;
	private String senha;
	private String tipoDeUsuario;
	
    public Usuario(){
        super();
    }
   
    
        
    public Usuario(long idUsuario, String email, String nome, String senha, String tipoDeUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.tipoDeUsuario = tipoDeUsuario;

	}



	public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
	
	
       @Override
	public String toString() {
		return this.idUsuario+"\n"+this.nome+"\n"+this.email+"\n"+this.senha;
	}


    }
     

