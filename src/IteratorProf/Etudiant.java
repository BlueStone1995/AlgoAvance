package IteratorProf;

import java.util.ArrayList;
import java.util.Iterator;

public class Etudiant implements Iterable<Cours> {
	String nom;
	int niveau;
	ArrayList<Cours> coursChoisis;
	private int n;
	
	// le constructeur
	public Etudiant(String nom, int niveau) {
		this.nom = nom;
		this.niveau = niveau;
		this.coursChoisis = new ArrayList<Cours>();
	}
	
	public void ajouterCours(Cours c) {
		if (n>=10) 
			return;
		this.coursChoisis.add(c);
		this.n++;
		
	}
	public void supprimerCours(Cours c) {
		this.coursChoisis.remove(c);
	}

	public String toString() {
		String s=this.nom+"\n";
		for (Cours c : this.coursChoisis) {
			s+= c.toString()+"\n";
		}
		return s;
	}
	
		
	
	@Override
	public Iterator<Cours> iterator() {
		return new IteratorEtudiant(this);
	}
}