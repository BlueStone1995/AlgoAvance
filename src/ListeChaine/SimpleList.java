package ListeChaine;

import java.util.Iterator;

public class SimpleList implements Iterable<String> {

    private Noeud contenu;

    public SimpleList() { // crée une liste vide
        this.contenu = null;
    }


    public void addEnTete(String s) {
        if (this.contenu == null) { // OK
            this.contenu = new Noeud(s, null);
        } else {
            this.contenu = new Noeud(s, this.contenu); // Non pris en compte
            System.out.println(this.contenu.getData());
        }
    }

    public void add(String s) { // OK
        this.contenu.addEnFin(s);
    }

    public boolean contains(String s) { // OK
        return this.contenu.containsNoeud(s);
    }

    public void insert(int i, String s) { // Insére s dans la liste i en partant de 0
        this.contenu.insertNoeud(i, s);
    }

    public void remove(int i) {
        if (i == 0) {
            this.contenu = this.contenu.getSuivant();
            return;
        }

        this.contenu.removeNoeud(i);
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAll(SimpleList l) { // OK
        this.contenu.addAllNoeud(l);
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

}
