package DoublyLinkedList;

public class Noeud {

    private String data;
    private Noeud suivant;
    private Noeud precedent;
    private static int compt = 0; // Variable de classe

    public Noeud() {
        this.data = null;
        this.suivant = null;
        this.precedent = null;
    }

    public Noeud(String data, Noeud precedent, Noeud suivant) {
        this.data = data;
        this.suivant = suivant;
        this.precedent = precedent;
    }

    public Noeud(String data) {
        this.data = data;

    }

    public boolean containsNoeudD(String s) {
        if (this.data.equals(s)) {
            return true;
        } else if (this.suivant == null) {
            return false;
        } else {
            return this.suivant.containsNoeudD(s);
        }
    }

    public void insertNoeudD(int i, String s) { // Insére s dans la liste i en partant de 0

        // Passe au suivant jusqu'a être au contenu i
        if (compt < i) {
            compt++;
            this.suivant.insertNoeudD(i, s);
        } else if (compt == i) {

            // Crée nouveau noeud dupliqué de i
            Noeud noeudI = new Noeud(this.data, this, this.suivant);

            // Insert donnée et modifie noeud suivant
            this.data = s;
            this.suivant = noeudI;
        }

        // Remet compteur à 0
        compt = 0;
    }

    public String removeNoeudD(int i) {
        String removeElement = "";
        // Passe au suivant jusqu'a être au contenu i-1
        if (compt < (i - 1)) {
            compt++;
            this.suivant.removeNoeudD(i);
        } else if (this.suivant.getSuivant() == null) {
            removeElement = this.suivant.getData();
            this.suivant = null;
        } else {
            removeElement = this.suivant.getData();
            this.suivant = this.suivant.getSuivant(); // Modifie le suivant de i-1 en prenant le noeud i+1
            this.suivant.setPrecedent(this); // Modifie le precedent de i+1 en prenant le noeud i-1
        }

        // Remet compteur à 0
        compt = 0;
        return removeElement;
    }

    // Getteurs et Setteurs
    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public Noeud getSuivant() {

        return suivant;
    }

    public void setSuivant(Noeud suivant) {

        this.suivant = suivant;
    }

    public Noeud getPrecedent() {
        return precedent;
    }

    public void setPrecedent(Noeud precedent) {
        this.precedent = precedent;
    }
}
