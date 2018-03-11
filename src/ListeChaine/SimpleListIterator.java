package ListeChaine;

import java.util.Iterator;

public class SimpleListIterator implements Iterator<String> {

    private SimpleList sl;

    SimpleListIterator(SimpleList sl) {
        this.sl = sl;
    }

    @Override
    public boolean hasNext() {
        return this.sl.getContenu().getSuivant() != null;
    }

    @Override
    public String next() {
        this.sl.setContenu(this.sl.getContenu().getSuivant());
        return this.sl.getContenu().getData();
    }
}
