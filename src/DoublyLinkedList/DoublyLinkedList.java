package DoublyLinkedList;

import java.util.ListIterator;

public class DoublyLinkedList {

    private Noeud tete; // Premier noeud
    private Noeud queue; // Dernier noeud
    private int taille;

    public DoublyLinkedList() { // crée une double liste vide
        this.tete = new Noeud();
        this.queue = this.tete;
        this.taille = 0;
    }

    public void addFirst(String s) { // OK

        if (this.tete.getData() == null) {
            this.tete.setData(s);
            this.taille++;
        } else {
            Noeud nouveauNoeud = new Noeud(s, null, this.tete);

            this.tete.setPrecedent(nouveauNoeud); // Modifie precedent du deuxieme noeud
            this.tete = nouveauNoeud; // Creer tete noeud

            this.taille++;
        }
    }

    public void addLast(String s) { // OK à tester

        if (this.queue.getData() == null) {
            this.queue.setData(s);
            this.taille++;
        } else {
            Noeud nouveauNoeud = new Noeud(s, this.queue, null);

            this.queue.setSuivant(nouveauNoeud); // Modifie suivant de l'avant queue noeud
            this.queue = nouveauNoeud; // Crer queue noeud

            this.taille++;
        }
    }


    public boolean contains(String s) { // OK à tester
        return this.tete.containsNoeudD(s);
    }

    // Insére s dans la liste i en partant de 0
    public void add(int i, String s) { // OK à tester
        if (i >= this.taille || i < 0) {
            return;
        } else {
            this.tete.insertNoeudD(i, s);
            this.taille++;
        }
    }

    // Enleve noeud i dans la liste en partant de 0
    public String remove(int i) { // OK à tester
        String removeElement = "";

        if (i >= this.taille || i < 0) {
            return removeElement;
        } else if (i == 0) { // Enleve tete
            removeElement = this.tete.getData();
            this.tete = this.tete.getSuivant();
            this.tete.setPrecedent(null);
        } else if (i == (this.taille - 1)) { // Enleve queue
            removeElement = this.queue.getData();
            this.queue = this.queue.getPrecedent();
            this.queue.setSuivant(null);
        } else {
            removeElement = this.tete.removeNoeudD(i);
        }
        this.taille--;
        return removeElement;
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public boolean addAll(DoublyLinkedList l) { // Ok à tester
        try {
            this.queue.setSuivant(l.tete); // Modifie suivant de mon dernier noeud de ma liste this
            l.tete.setPrecedent(this.queue); // Modifie précedent de mon premier noeud de ma liste l
            this.queue = l.queue; // Modifie pointeur de mon dernier noeud
            this.taille = this.taille + l.getTaille(); // Modifie taille total
            return true;
        } catch (Error e) {
            return false;
        }
    }

    public String getFirst() {
        return this.tete.getData();
    }

    public String getLast() {
        return this.queue.getData();
    }

    public String removeFirst() {
        /**
         String dataFirst = this.tete.getData();
         this.tete.setData("");
         this.taille--;
         */
        return this.remove(0);
    }

    public String removeLast() {
        /**
         String dataLast = this.queue.getData();
         this.queue.setData("");
         */
        return this.remove(this.taille - 1);
    }

    public void push(String s) {
        this.addFirst(s);
    }

    public String peek() {
        return this.tete.getData();
    }

    public String poll() {
        String pollData = this.tete.getData();
        this.removeFirst();
        return pollData;
    }

    // retourne un ListIterator qui énumère les String contenus dans la liste
    public ListIterator<String> iterator() { //
        return new DoublyLinkedListIterator(this);
    }

    // Getteur et Setteur
    public Noeud getTete() {
        return this.tete;
    }

    public void setTete(Noeud tete) {

        this.tete = tete;
    }

    public Noeud getQueue() {
        return this.queue;
    }

    public void setQueue(Noeud queue) {
        this.queue = queue;
    }

    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }
}
