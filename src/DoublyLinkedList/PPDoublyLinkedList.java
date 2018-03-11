package DoublyLinkedList;

import java.util.ListIterator;

public class PPDoublyLinkedList {

    public static void main(String args[]) {

        DoublyLinkedList<String> stringDoublyLinkedList = new DoublyLinkedList<String>();

        stringDoublyLinkedList.addFirst("A");
        stringDoublyLinkedList.addLast("B");
        stringDoublyLinkedList.addLast("C");
        stringDoublyLinkedList.addLast("D");
        stringDoublyLinkedList.addLast("E");
        stringDoublyLinkedList.removeFirst();
        stringDoublyLinkedList.remove(1);

        System.out.println("Test contains : ");
        System.out.println(
                "A est dans stringDoublyLinkedList : " + stringDoublyLinkedList.contains("A") + "\n" +
                        "B est dans stringDoublyLinkedList : " + stringDoublyLinkedList.contains("B") + "\n" +
                        "S est dans stringDoublyLinkedList : " + stringDoublyLinkedList.contains("S") + "\n" +
                        "F est dans stringDoublyLinkedList : " + stringDoublyLinkedList.contains("F") + "\n"
        );

        ListIterator<String> listIterator = stringDoublyLinkedList.iterator();

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
        doublyLinkedList.addFirst("F");
        doublyLinkedList.addLast("G");
        doublyLinkedList.addLast("H");

        stringDoublyLinkedList.addAll(doublyLinkedList);
        // Affichage
        System.out.print("[ " + stringDoublyLinkedList.getTete().getData() + " ");
        while (listIterator.hasNext()) {

            System.out.print(listIterator.next() + " ");
        }
        System.out.println("]\n");


        System.out.println("Test push, peek et poll : ");
        stringDoublyLinkedList.push("début");
        System.out.println(stringDoublyLinkedList.peek() + "\n" +
                stringDoublyLinkedList.poll() + "\n");

        System.out.println("Test ListIterator : ");
        DoublyLinkedList<String> d = new DoublyLinkedList<String>();
        d.addFirst("1");
        d.addLast("2");
        d.addLast("3");
        d.addLast("4");
        d.addLast("5");

        ListIterator<String> liste = d.iterator();

        System.out.print("[ " + d.getTete().getData() + " ");
        while (liste.hasNext()) {

            System.out.print(liste.next() + " ");
        }
        System.out.println("]");

        System.out.print("[ " + d.getQueue().getData() + " ");
        while (liste.hasPrevious()) {

            System.out.print(liste.previous() + " ");
        }
        System.out.print("]");
    }
}
