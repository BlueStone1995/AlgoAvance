package ListeChaineProf;

public class Noeud {

    private String data;
    private Noeud suivant;
    private static int compt = 0; // Variable de classe
    private static int nbNoeud = 0;

    public Noeud(String data, Noeud suivant) {
        this.data = data;
        this.suivant = suivant;
        nbNoeud++;
    }

    public Noeud(String data) {

        this.data = data;
        nbNoeud++;
    }

    public void addEnFin(String s) {
        if (this.suivant == null) {
            this.suivant = new Noeud(s);
            nbNoeud++;
        } else {
            this.suivant.addEnFin(s);
        }
    }


    public boolean containsNoeud(String s) {
        if (this.data == s) {
            return true;
        } else if (this.suivant == null) {
            return false;
        } else {
            this.suivant.containsNoeud(s);
        }
        return false;
    }

    public void insertNoeud(int i, String s) { // Insére s dans la liste i en partant de 0
        if (i > nbNoeud && i < 0) {
            return;
        }

        // Passe au suivant jusqu'a être au contenu i
        while (compt < i) {
            this.suivant.insertNoeud(i, s);
            compt++;
        }

        // Crée nouveau noeud
        Noeud noeudI = new Noeud(this.data, this.suivant);

        // Insert donnée et modifie noeud suivant
        this.data = s;
        this.suivant = noeudI;

        // Remet compteur à 0 et met à jour nombre de Noeud
        compt = 0;
        nbNoeud++;
    }

    public void removeNoeud(int i) {
        if (i > nbNoeud && i < 0) {
            return;
        }

        // Passe au suivant jusqu'a être au contenu i
        while (compt < (i - 1)) {
            this.removeNoeud(i);
            compt++;
        }

        if (this.suivant.getSuivant() == null) {
            this.suivant = null;
        } else {
            // Modifie le suivant de i-1 en prenant le noeud i+1
            this.suivant = this.suivant.getSuivant();
        }

        // Remet compteur à 0 et met à jour nombre de Noeud
        compt = 0;
        if (nbNoeud > 0) {
            nbNoeud--;
        }
        nbNoeud = 0;
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
