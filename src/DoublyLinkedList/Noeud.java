package DoublyLinkedList;


public class Noeud<T> {
    private T data;
    private Noeud tete;
    private Noeud queue;
    private static int compt = 0; // Variable de classe

    public Noeud() {
        this.data = null;
        this.tete = null;
        this.queue = null;
    }

    public Noeud(T data, Noeud queue, Noeud tete) {
        this.data = data;
        this.tete = tete;
        this.queue = queue;
    }

    public Noeud(T data) {
        this.data = data;

    }

    public boolean containsNoeudD(T t) {
        if (this.data.equals(t)) {
            return true;
        } else
            return this.tete != null && this.tete.containsNoeudD(t);
    }

    public void insertNoeudD(int i, T t) { // Insére s dans la liste i en partant de 0

        // Passe au tete jusqu'a être au contenu i
        if (compt < i) {
            compt++;
            this.tete.insertNoeudD(i, t);
        } else if (compt == i) {

            // Crée nouveau noeud dupliqué de i
            Noeud noeudI = new Noeud(this.data, this, this.tete);

            // Insert donnée et modifie noeud tete
            this.data = t;
            this.tete = noeudI;
        }

        // Remet compteur à 0
        compt = 0;
    }

    public T removeNoeudD(int i) {

        T removeElement = null;
        // Passe au tete jusqu'a être au contenu i-1
        if (compt < (i - 1)) {
            compt++;
            this.tete.removeNoeudD(i);
        } else if (this.tete.getTete() == null) {

            removeElement = (T) this.tete.getData();
            this.tete = null;
        } else {
            removeElement = (T) this.tete.getData();
            this.tete = this.tete.getTete(); // Modifie le tete de i-1 en prenant le noeud i+1
            this.tete.setQueue(this); // Modifie le queue de i+1 en prenant le noeud i-1
        }

        // Remet compteur à 0
        compt = 0;
        return removeElement;
    }

    // Getteurs et Setteurs
    public T getData() {
        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    public Noeud getTete() {

        return tete;
    }

    public void setTete(Noeud tete) {

        this.tete = tete;
    }

    public Noeud getQueue() {
        return queue;
    }

    public void setQueue(Noeud queue) {
        this.queue = queue;
    }
}
