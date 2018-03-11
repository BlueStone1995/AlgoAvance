package DoublyLinkedListGenerique;


import java.util.ListIterator;

public class DoublyLinkedListIteratorGenerique<T> implements ListIterator<T> {
    private DoublyLinkedListGenerique<T> dl;
    private static int index;

    DoublyLinkedListIteratorGenerique(DoublyLinkedListGenerique dl) {

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
    public T next() {
        this.dl.setTete(this.dl.getTete().getSuivant());
        index++;
        return (T) this.dl.getTete().getData();
    }


    @Override
    public T previous() {
        this.dl.setQueue(this.dl.getQueue().getPrecedent());
        index--;
        return (T) this.dl.getQueue().getData();
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
    public void set(T s) {

    }

    @Override
    public void add(T s) {

    }
}
