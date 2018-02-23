package ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class IntArrayList implements Iterable<String> {

    private int[] tab;
    private int taille;


    IntArrayList() {
        this.tab = new int[10];
        this.taille = 0;
    }

    public boolean add(int e) {
        this.setTaille(this.getTaille() + 1);
        ensureCapacity(this.getTaille());

        try {
            this.getTab()[this.getTaille()] = e;
            return true;
        } catch (Error err) {
            return false;
        }
    }

    public boolean add(int index, int e) {
        this.setTaille(this.getTaille() + 1);
        ensureCapacity(this.getTab().length);
        try {
            this.getTab()[index] = e;
            return true;
        } catch (Error err) {
            return false;
        }
    }

    public boolean contains(int n) {
        for (int i = 0; i < this.getTab().length; i++) {
            if (this.getTab()[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity < this.getTab().length) {
            return;
        }

        int[] tmp = new int[minCapacity * 2];
        for (int i = 0; i < this.getTab().length; i++) {
            tmp[i] = this.getTab()[i];
        }
        this.setTab(tmp);
    }

    public int get(int index) {
        try {
            return this.getTab()[index];
        } catch (Error e) {
            System.out.println("La case " + index + " n'existe pas dans le tableau...");
            return -1; // Pas la meilleur des solutions...
        }
    }


    public int indexOf(int e) {
        for (int i = 0; i < this.getTaille(); i++) {
            if (this.getTab()[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return (this.getTaille() == 0);
    }

    public int remove(int index) {
        this.setTaille(this.getTaille() - 1); // Enlève un élément

        int[] tmp = new int[this.getTab().length - 1];

        for (int i = 0; i < (this.getTab().length - 1); i++) {
            if (i == index) {
                i++;
            } else {
                tmp[i] = this.getTab()[i]; // Recopie valeur avant et apres index
            }
        }
        int elementRemove = this.getTab()[index];
        this.setTab(tmp);

        return elementRemove;
    }

    public int size() {
        return this.getTaille();
    }

    /**
     * Classe itérable est une interface qui a besoins des méthodes hasNext et next
     *
     */
    public Iterator<String> iterator() {


        Iterator<String> it = new Iterator<String>() {
            @Override
            public boolean hasNext() {

                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

        return it;
    }

    public ListIterator<String> listIterator() {
        ListIterator<String> it = new ListIterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public String previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(String s) {

            }

            @Override
            public void add(String s) {

            }
        };

        for (int i = 0; i < this.getTaille(); i++) {
            it.add(Integer.toString(this.getTab()[i]));
        }

        return it;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {

        this.tab = tab;
    }

    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }

    /**
     * forEach en Java : for (element : tab) {}
     */
}
