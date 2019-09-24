package SimpleList;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleList implements Iterable<String> {

    private Noeud contenu;
    ArrayList<String> datainList;
    private int position=0;

    public Noeud getContenu() {
        return contenu;
    }

    public SimpleList() { // crée une liste vide
        this.contenu = null;
        this.datainList = new ArrayList<String>();
    }

    public void addEnTete(String s) {
        this.contenu = new Noeud(s, contenu);
        int position = 0;
        while (this.contenu != null) {
            this.datainList.set(position, this.contenu.getData());
            position++;
            this.contenu = this.contenu.getSuivant();
        }
    }

    public void add(String s) { //en queue
        this.contenu.addEnFin(s);
        this.datainList.add(s);
    }


    public Noeud getSuivant() {
        return this.contenu.getSuivant();
    }



    /*public  boolean contains(String s) {
        if (this.datainList.get(position)==s) {
            return true;
        }
        position ++;
        this.contains(s);
        return false;
    }*/

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

    //??? (wrong)
    public void insert(int i, String s) {
        Noeud aux = this.contenu;
        SimpleList auxList = new SimpleList();
        auxList.contenu = aux.getLast();
        if (i == 0) {
            addEnTete(s);
        } else {
            for (int a = 0; a <= i; a++) {
                aux = aux.getSuivant();
                auxList.contenu.addEnFin(aux.getData());
                if (a == i) {
                    aux = new Noeud(s, aux.getSuivant());
                    SimpleList aux2 = new SimpleList();
                    aux2.contenu = aux;
                    auxList.addAll(aux2);
                    this.contenu = auxList.contenu;
                }

            }
        }
    }

    public String getString(int i) {
        return this.datainList.get(i);
    }

    /*public void remove(int i) {
        this.datainList.remove(this.getString(i));
    }*/

    public void remove(int i) {
        if (i == 0) {
            this.contenu = this.contenu.getSuivant();
        } else if (this.contenu.getSuivant() == null) {
            this.contenu = null;
        } else {
            for (int a = 0; a <= i; a++) {
                if (a == i) {
                    this.contenu = this.contenu.getSuivant();
                }
            }
        }
    }


    // ajoute tous les éléments de la liste l à la fin de this

    /*public void addAll(SimpleList l) {
        this.datainList.addAll(l.datainList);
        this.contenu.setSuivant(l.contenu);
    }*/

    public void addAll(SimpleList l) {
        if (this.contenu.getSuivant() == null)
            this.contenu.setSuivant(l.contenu);
        else
            this.getSuivant().addEnFin(l.contenu.getData());
        l.contenu = l.contenu.getSuivant();
        this.addAll(l);
    }


    // retourne un itérateru qui énumère les String contenus dans la liste
    @Override
    public Iterator<String> iterator() {
        return new IteratorString(this);
    }
}
