package SimpleList;

public class Noeud {
	private String data;
	private Noeud suivant;


	public Noeud(String data, Noeud suivant) {
		this.data = data;
		this.suivant = suivant;
	}
	public Noeud(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Noeud getSuivant() {
		return suivant;
	}
	public void setSuivant(Noeud suivant) {
		this.suivant = suivant;
	}
	
	public void addEnFin(String s) {
		if (this.suivant==null)
			this.suivant=new Noeud(s);
		else 
			this.suivant.addEnFin(s);
	}

	public Noeud getLast() {
	    return this;
    }


	
}
