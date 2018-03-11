package DoublyLinkedList;


import java.util.ListIterator;

public class DoublyLinkedListIterator<T> implements ListIterator<T> {
    private DoublyLinkedList<T> dl;
    private static int index;

    DoublyLinkedListIterator(DoublyLinkedList dl) {

        this.dl = dl;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.dl.getTete().getTete() != null;
    }

    @Override
    public boolean hasPrevious() {
        return this.dl.getQueue().getQueue() != null;
    }

    @Override
    public T next() {
        this.dl.setTete(this.dl.getTete().getTete());
        index++;
        return (T) this.dl.getTete().getData();
    }


    @Override
    public T previous() {
        this.dl.setQueue(this.dl.getQueue().getQueue());
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
