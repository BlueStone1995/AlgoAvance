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
        if (this.contenu.getData() == s) {
            return true;
        } else if (this.contenu.getSuivant() == null) {
            return false;
        } else {
            this.contenu = this.contenu.getSuivant();
            this.contains(s);
        }
        return false;
    }

    public void insert(int i, String s) { // Insére s dans la liste i en partant de 0
        int compt = 0;

        // Passe au suivant jusqu'a être au contenu i
        while (compt < i) {
            this.contenu = this.contenu.getSuivant();
            compt++;
        }

        // Crée nouveau noeud
        Noeud noeudI = new Noeud(this.contenu.getData(), this.contenu.getSuivant());

        // Insert donnée et modifie noeud suivant
        this.contenu.setData(s);
        this.contenu.setSuivant(noeudI);
    }

    public void remove(int i) {
        int compt = 0;

        // Passe au suivant jusqu'a être au contenu i
        while (compt < (i - 1)) {
            this.contenu = this.contenu.getSuivant();
            compt++;
        }

        // Modifie le suivant de i-1 en prenant le noeud i+1
        this.contenu.setSuivant(this.contenu.getSuivant().getSuivant());
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAll(SimpleList l) {
        if (this.contenu.getSuivant() == null) {
            this.contenu.setSuivant(l.contenu);
            return;
        }

        // Parcours jusqu'à la fin du this
        this.contenu = this.contenu.getSuivant();
        this.addAll(l);
    }

    // retourne un itérateru qui énumère les String contenus dans la liste
    public Iterator<String> iterator() {
        return new SimpleListIterator(this);
    }

    public Noeud getContenu() {
        return contenu;
    }

    public void setContenu(Noeud contenu) {
        this.contenu = contenu;
    }

}
