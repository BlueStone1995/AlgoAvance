package IteratorProf;

import java.util.ArrayList;
import java.util.Collections;

public class Principale {

	public static void main(String[] args) {
		Etudiant b = new Etudiant("Bob",2);
		Etudiant a = new Etudiant("Anna",3);

		int [] x = {1,3}; // permet de définir le tableau [1,3]
		Cours c1 = new Cours("Math", x);
		Cours c2 = new Cours("Histoire", x);
		Cours c3 = new Cours("Géo", x);
		Cours c4 = new Cours("Francais", x);
		
		ArrayList<Cours> t= new ArrayList<Cours>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
	
		System.out.println(t);
		//Collections.sort(t);
		System.out.println(t);

		a.ajouterCours(c1);
		a.ajouterCours(c3);

		for (Cours c : a) {
			System.out.println(c);
		}
		
		
/*
 * 
		System.out.println(c2.verifNiveau(1));
		System.out.println(c2.verifNiveau(2));

		a.ajouterCours(c1);
		a.ajouterCours(c2);
		
		System.out.println(a);
	*/
		
		
		
	}

}
