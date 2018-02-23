package ListeChaine;

import java.util.Scanner;

public class Liste {

    private String element;
    private Noeud noeud;

    Liste() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un element : ");
        this.element = sc.nextLine();
        sc.nextLine(); // vide cache

        this.noeud = new Noeud(this);

    }

    Liste(String e) {
        this.element = e;

        this.noeud = new Noeud(this);

    }

    public void add(String e) {
        Liste l = new Liste(e);
        Noeud n = new Noeud(this);
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Noeud getNoeud() {
        return noeud;
    }

    public void setNoeud(Noeud noeud) {
        this.noeud = noeud;
    }


}
