package DoublyLinkedList;

import java.util.ListIterator;

public class DoublyLinkedListIterator implements ListIterator<String> {

    private DoublyLinkedList dl;
    private static int index;

    DoublyLinkedListIterator(DoublyLinkedList dl) {

        this.dl = dl;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.dl.getTete().getSuivant() != null;
    }

    @Override
    public boolean hasPrevious() {
        return this.dl.getQueue().getPrecedent() != null;
    }

    @Override
    public String next() {
        this.dl.setTete(this.dl.getTete().getSuivant());
        index++;
        return this.dl.getTete().getData();
    }


    @Override
    public String previous() {
        this.dl.setQueue(this.dl.getQueue().getPrecedent());
        index--;
        return this.dl.getQueue().getData();
    }

    @Override
    public int nextIndex() {
        int nextInd = index;
        return ++nextInd;
    }

    @Override
    public int previousIndex() {
        int previoustInd = index;
        return --previoustInd;
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
}
