package model;


public class Liderado extends Usuario{
    private long idLiderado;
    
    public Liderado(){
        
    }
    public Liderado(long idLiderado) {
    	super();
    	this.idLiderado= idLiderado;
    }
    public long getIdLiderado() {
		return idLiderado;
	}


	public void setIdLiderado(long idLiderado) {
		this.idLiderado = idLiderado;
	}


}

