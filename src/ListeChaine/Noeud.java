package ListeChaine;

public class Noeud {

    private String data;
    private Noeud suivant;
    private static int compt = 0; // Variable de classe

    public Noeud(String data, Noeud suivant) {
        this.data = data;
        this.suivant = suivant;
    }


    public Noeud(String data) {
        this.data = data;
    }

    public void addEnFin(String s) {
        if (this.suivant == null) {
            this.suivant = new Noeud(s);
        } else {
            this.suivant.addEnFin(s);
        }
    }


    public boolean containsNoeud(String s) {
        if (this.data.equals(s)) {
            return true;
        } else if (this.suivant == null) {
            return false;
        } else {
            return this.suivant.containsNoeud(s);
        }
    }

    public void insertNoeud(int i, String s) { // Insére s dans la liste i en partant de 0

        // Passe au suivant jusqu'a être au contenu i
        if (compt < i) {
            compt++;
            this.suivant.insertNoeud(i, s);
        } else if (compt == i) {

            // Crée nouveau noeud
            Noeud noeudI = new Noeud(this.data, this.suivant);

            // Insert donnée et modifie noeud suivant
            this.data = s;
            this.suivant = noeudI;
        }

        // Remet compteur à 0
        compt = 0;
    }

    public void removeNoeud(int i) {
        // Passe au suivant jusqu'a être au contenu i
        if (compt < (i - 1)) {
            compt++;
            this.suivant.removeNoeud(i);
        } else if (this.suivant.getSuivant() == null) {
            this.suivant = null;
        } else {
            // Modifie le suivant de i-1 en prenant le noeud i+1
            this.suivant = this.suivant.getSuivant();
        }

        // Remet compteur à 0
        compt = 0;
    }

    // ajoute tous les éléments de la liste l à la fin de this
    public void addAllNoeud(SimpleList l) {
        if (this.suivant == null) {
            this.suivant = l.getContenu();
            return;
        }

        // Parcours jusqu'à la fin du this
        this.suivant.addAllNoeud(l);
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

}
