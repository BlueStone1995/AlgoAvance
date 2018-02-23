package IteratorProf;

public class Cours { //implements Comparable<Cours>{
	// attributs
	String nom;
	int [] niveau;
	
	//constructeur
	public Cours(String nom, int[] niveau) {
		this.nom = nom;
		this.niveau = niveau;
	}
	// méthodes
	
	// celle-ci est ce qu'on appelle un "getter", c'est un genre
	// de méthodes qu'on retrouve souvent utilisé pour retourner
	// la valeur d'un attribut, on la nomme en général "get" suivi
	// du nom de l'attrribut (en ajoutant une majusqcule)
	public String getNom() {
		return this.nom;		
	}

	public boolean verifNiveau(int n) {
		for (int i=0;i<this.niveau.length;i++) {
			if (this.niveau[i]==n) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.nom+niveau[0];
	}

	// doit retourner un nombre négatif si this est plus petit que o
	// doit retourner un nombre positif si this est plus grand que o
	// zero si il y a égalité
	public int compareTo(Cours o) {
		int x =this.nom.compareTo(o.nom);
		if (x!=0){
			return x;
		}
		return this.niveau[0]-o.niveau[0]; 
		
	}
	
}

	
