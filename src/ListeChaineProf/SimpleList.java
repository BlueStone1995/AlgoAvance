package ListeChaineProf;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class SimpleList implements Iterable<String> {

    private Noeud contenu;

    public SimpleList() { // crée une liste vide

        this.contenu = null;
    }


    public void addEnTete(String s) {
        this.contenu = new Noeud(s, contenu);
    }

    public void add(String s) { //en queue
        this.contenu.addEnFin(s);
    }

    public boolean contains(String s) {
        return this.contenu.containsNoeud(s);
    }

    public void insert(int i, String s) { // Insére s dans la liste i en partant de 0

        this.contenu.insertNoeud(i, s);
    }

    public void remove(int i) {
        if (i == 0) {
            this.contenu = this.contenu.getSuivant();
        }

        this.contenu.removeNoeud(i);
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAll(SimpleList l) {
        this.contenu.addAllNoeud(l);
    }

    // retourne un itérateru qui énumère les String contenus dans la liste
    public Iterator<String> iterator() {
        return new SimpleListIterator(this);
    }

    // Getteur et Setteur
    public Noeud getContenu() {
        return contenu;
    }

    public void setContenu(Noeud contenu) {
        this.contenu = contenu;
    }

}
