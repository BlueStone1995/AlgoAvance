package ArrayList;

import java.util.Iterator;

public class StringArrayList implements Iterable<String> {


    private String[] elementData;
    private int taille;


    StringArrayList() {
        this.elementData = new String[10];
        this.taille = 0;
    }

    public boolean add(String e) {
        this.taille++;
        ensureCapacity(this.taille);

        try {
            this.elementData[this.taille - 1] = e;
            return true;
        } catch (Error err) {
            return false;
        }
    }

    public void add(int index, String e) {
        this.taille++;
        ensureCapacity(this.taille);
        ensureCapacity(index); // Au cas ou si index > this.elementData.length

        // Recopie tab dans tmp
        String[] tmp = new String[this.elementData.length];
        for (int i = 0; i < this.elementData.length; i++) {
            tmp[i] = this.elementData[i];
        }

        this.elementData[index] = e;

        // Remplie suite elementData apres element à insérer
        for (int j = (index+1); j < this.elementData.length; j++) {
            this.elementData[j] = tmp[j-1];
        }
    }

    public boolean contains(Object o) {
        for (int i = 0; i < this.elementData.length; i++) {
            if (this.elementData[i] == o) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity < this.elementData.length) {
            return;
        }

        String[] tmp = new String[minCapacity * 2];
        for (int i = 0; i < this.elementData.length; i++) {
            tmp[i] = this.elementData[i];
        }
        this.elementData = tmp;
    }

    public String get(int index) {
        try {
            return this.elementData[index];
        } catch (Error e) {
            return "La case " + index + " n'existe pas dans le tableau...";
        }
    }


    public int indexOf(Object o) {
        for (int i = 0; i < this.elementData.length; i++) {
            if (this.elementData[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return (this.taille == 0);
    }

    public String remove(int index) {
        this.taille--; // Enlève un élément

        String[] tmp = new String[this.elementData.length];

        for (int i = 0; i < this.elementData.length; i++) {
            if (i == index) {
                i++;
            } else {
                tmp[i] = this.elementData[i]; // Recopie valeur avant et apres index
            }
        }

        String elementRemove = this.elementData[index];
        this.elementData = tmp;

        return elementRemove;
    }

    public String set(int index, String element) {
        try {
            return this.elementData[index] = element;
        } catch (Error e) {
            return "La case " + index + " n'existe pas dans le tableau...";
        }
    }

    public int size() {
        return this.taille;
    }

    /**
     * Classe itérable est une interface qui a besoins des méthodes hasNext et next
     */
    public Iterator<String> iterator() {

        StringArrayListIterator ali = new StringArrayListIterator(this);
        return ali;
    }


    public String[] getElementData() {
        return elementData;
    }

    public void setElementData(String[] elementData) {

        this.elementData = elementData;
    }

    public int getTaille() {

        return taille;
    }

    public void setTaille(int taille) {

        this.taille = taille;
    }

}


