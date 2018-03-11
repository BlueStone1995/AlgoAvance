package DoublyLinkedListGenerique;


public class NoeudGenerique<T> {
    private T data;
    private NoeudGenerique suivant;
    private NoeudGenerique precedent;
    private static int compt = 0; // Variable de classe

    public NoeudGenerique() {
        this.data = null;
        this.suivant = null;
        this.precedent = null;
    }

    public NoeudGenerique(T data, NoeudGenerique precedent, NoeudGenerique suivant) {
        this.data = data;
        this.suivant = suivant;
        this.precedent = precedent;
    }

    public NoeudGenerique(T data) {
        this.data = data;

    }

    public boolean containsNoeudD(T t) {
        if (this.data.equals(t)) {
            return true;
        } else
            return this.suivant != null && this.suivant.containsNoeudD(t);
    }

    public void insertNoeudD(int i, T t) { // Insére s dans la liste i en partant de 0

        // Passe au suivant jusqu'a être au contenu i
        if (compt < i) {
            compt++;
            this.suivant.insertNoeudD(i, t);
        } else if (compt == i) {

            // Crée nouveau noeud dupliqué de i
            NoeudGenerique noeudI = new NoeudGenerique(this.data, this, this.suivant);

            // Insert donnée et modifie noeud suivant
            this.data = t;
            this.suivant = noeudI;
        }

        // Remet compteur à 0
        compt = 0;
    }

    public T removeNoeudD(int i) {

        T removeElement = null;
        // Passe au suivant jusqu'a être au contenu i-1
        if (compt < (i - 1)) {
            compt++;
            this.suivant.removeNoeudD(i);
        } else if (this.suivant.getSuivant() == null) {

            removeElement = (T) this.suivant.getData();
            this.suivant = null;
        } else {
            removeElement = (T) this.suivant.getData();
            this.suivant = this.suivant.getSuivant(); // Modifie le suivant de i-1 en prenant le noeud i+1
            this.suivant.setPrecedent(this); // Modifie le precedent de i+1 en prenant le noeud i-1
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

    public NoeudGenerique getSuivant() {

        return suivant;
    }

    public void setSuivant(NoeudGenerique suivant) {

        this.suivant = suivant;
    }

    public NoeudGenerique getPrecedent() {
        return precedent;
    }

    public void setPrecedent(NoeudGenerique precedent) {
        this.precedent = precedent;
    }
}
