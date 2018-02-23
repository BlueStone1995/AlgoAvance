package ListeChaineProf;

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

    }

    public void insert(int i, String s) {

    }

    public void remove(int i) {

    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAll(SimpleList l) {

    }

    // retourne un itérateru qui énumère les String contenus dans la liste
    public Iterator<String> iterator() {

    }


}
