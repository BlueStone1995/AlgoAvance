package DoublyLinkedListGenerique;

import DoublyLinkedListGenerique.NoeudGenerique;

import java.util.ListIterator;

public class DoublyLinkedListGenerique<T> {
    private NoeudGenerique tete; // Premier noeud
    private NoeudGenerique queue; // Dernier noeud
    private int taille;

    public DoublyLinkedListGenerique() { // crée une double liste vide
        this.tete = new NoeudGenerique();
        this.queue = this.tete;
        this.taille = 0;
    }

    public void addFirst(T s) { // OK

        if (this.tete.getData() == null) {
            this.tete.setData(s);
            this.taille++;
        } else {
            NoeudGenerique nouveauNoeud = new NoeudGenerique(s, null, this.tete);

            this.tete.setPrecedent(nouveauNoeud); // Modifie precedent du deuxieme noeud
            this.tete = nouveauNoeud; // Creer tete noeud

            this.taille++;
        }
    }

    public void addLast(T s) { // OK à tester

        if (this.queue.getData() == null) {
            this.queue.setData(s);
            this.taille++;
        } else {
            NoeudGenerique nouveauNoeud = new NoeudGenerique(s, this.queue, null);

            this.queue.setSuivant(nouveauNoeud); // Modifie suivant de l'avant queue noeud
            this.queue = nouveauNoeud; // Crer queue noeud

            this.taille++;
        }
    }


    public boolean contains(T s) { // OK à tester
        return this.tete.containsNoeudD(s);
    }

    // Insére s dans la liste i en partant de 0
    public void add(int i, T s) { // OK à tester
        if (i >= this.taille || i < 0) {
            return;
        } else {
            this.tete.insertNoeudD(i, s);
            this.taille++;
        }
    }

    // Enleve noeud i dans la liste en partant de 0
    public T remove(int i) { // OK à tester
        T removeElement = null;

        if (i >= this.taille || i < 0) {
            return removeElement;
        } else if (i == 0) { // Enleve tete
            removeElement = (T) this.tete.getData();
            this.tete = this.tete.getSuivant();
            this.tete.setPrecedent(null);
        } else if (i == (this.taille - 1)) { // Enleve queue
            removeElement = (T) this.queue.getData();
            this.queue = this.queue.getPrecedent();
            this.queue.setSuivant(null);
        } else {
            removeElement = (T) this.tete.removeNoeudD(i);
        }
        this.taille--;
        return removeElement;
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public boolean addAll(DoublyLinkedListGenerique l) { // Ok à tester
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

    public T getFirst() {
        return (T) this.tete.getData();
    }

    public T getLast() {
        return (T) this.queue.getData();
    }

    public T removeFirst() {
        /**
         String dataFirst = this.tete.getData();
         this.tete.setData("");
         this.taille--;
         */
        return this.remove(0);
    }

    public T removeLast() {
        /**
         String dataLast = this.queue.getData();
         this.queue.setData("");
         */
        return this.remove(this.taille - 1);
    }

    public void push(T s) {
        this.addFirst(s);
    }

    public T peek() {
        return (T) this.tete.getData();
    }

    public T poll() {
        T pollData = (T) this.tete.getData();
        this.removeFirst();
        return pollData;
    }

    // retourne un ListIterator qui énumère les String contenus dans la liste
    public ListIterator<T> iterator() { //
        return new DoublyLinkedListIteratorGenerique(this);
    }

    // Getteur et Setteur
    public NoeudGenerique getTete() {
        return this.tete;
    }

    public void setTete(NoeudGenerique tete) {

        this.tete = tete;
    }

    public NoeudGenerique getQueue() {
        return this.queue;
    }

    public void setQueue(NoeudGenerique queue) {
        this.queue = queue;
    }

    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }
}
