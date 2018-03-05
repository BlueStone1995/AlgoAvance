package ListeChaine;

import java.util.Iterator;

public class SimpleList implements Iterable<String> {

    private Noeud contenu;
    private int nbNoeud;

    public SimpleList() { // crée une liste vide
        this.contenu = null;
        this.nbNoeud = 0;
    }

    public void addEnTete(String s) { // OK
        this.contenu = new Noeud(s, this.contenu);
        this.nbNoeud++;
    }

    public void add(String s) { // OK
        this.contenu.addEnFin(s);
        this.nbNoeud++;
    }

    public boolean contains(String s) { // OK
        return this.contenu.containsNoeud(s);
    }

    // Insére s dans la liste i en partant de 0
    public void insert(int i, String s) { // OK
        if (i >= this.nbNoeud || i < 0) {
            return;
        } else {
            this.contenu.insertNoeud(i, s);
            this.nbNoeud++;
        }
    }

    // Enleve noeud i dans la liste en partant de 0
    public void remove(int i) { // OK
        if (i >= this.nbNoeud || i < 0) {
            return;
        } else if (i == 0) {
            this.contenu = this.contenu.getSuivant();
            return;
        } else {
            this.contenu.removeNoeud(i);
            this.nbNoeud--;
        }
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAll(SimpleList l) { // OK
        this.contenu.addAllNoeud(l);
        this.nbNoeud = this.nbNoeud + l.getNbNoeud();
    }

    // retourne un itérateru qui énumère les String contenus dans la liste
    public Iterator<String> iterator() { // OK
        return new SimpleListIterator(this);
    }

    // Getteur et Setteur
    public Noeud getContenu() {
        return contenu;
    }

    public void setContenu(Noeud contenu) {
        this.contenu = contenu;
    }

    public int getNbNoeud() {
        return nbNoeud;
    }

    public void setNbNoeud(int nbNoeud) {
        this.nbNoeud = nbNoeud;
    }
}
