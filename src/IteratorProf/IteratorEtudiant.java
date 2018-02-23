package IteratorProf;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEtudiant implements Iterator<Cours> {
	int position = 0; 
	ArrayList<Cours> c;
	public IteratorEtudiant(Etudiant e) {
		this.c = e.coursChoisis;
	}

	public boolean hasNext() {
		return this.position<this.c.size();
	}

	@Override
	public Cours next() {
		this.position++;
		return this.c.get(this.position-1);
		
	}

	
}
