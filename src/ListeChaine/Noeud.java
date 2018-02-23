package ListeChaine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Noeud implements Iterator<String> {

    private Map<Noeud, Liste> hm;
    private Liste liste;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    public Map<Noeud, Liste> getHm() {
        return hm;
    }

    public void setHm(Map<Noeud, Liste> hm) {
        this.hm = hm;
    }

    public Liste getListe() {
        return liste;
    }

    public void setListe(Liste liste) {
        this.liste = liste;
    }

    Noeud(Liste l) {

        this.liste = l;

        this.hm = new HashMap<>();
        this.hm.put(this, l);
    }
}
