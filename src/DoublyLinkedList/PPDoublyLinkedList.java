package DoublyLinkedList;

import java.util.ListIterator;

public class PPDoublyLinkedList {

    public static void main(String args[]) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFirst("A");
        doublyLinkedList.addLast("B");
        doublyLinkedList.addLast("C");
        doublyLinkedList.addLast("D");
        doublyLinkedList.addLast("E");
        doublyLinkedList.removeFirst();
        doublyLinkedList.remove(1);

        System.out.println("Test contains : ");
        System.out.println(
                "A est dans doublyLinkedList : " + doublyLinkedList.contains("A") + "\n" +
                        "B est dans doublyLinkedList : " + doublyLinkedList.contains("B") + "\n" +
                        "S est dans doublyLinkedList : " + doublyLinkedList.contains("S") + "\n" +
                        "F est dans doublyLinkedList : " + doublyLinkedList.contains("F") + "\n"
        );

        ListIterator<String> listIterator = doublyLinkedList.iterator();

        // Affichage
        System.out.print("[ " + doublyLinkedList.getTete().getData() + " ");
        while (listIterator.hasNext()) {

            System.out.print(listIterator.next() + " ");
        }
        System.out.println("]\n");


        System.out.println("Test push, peek et poll : ");
        doublyLinkedList.push("début");
        System.out.println(doublyLinkedList.peek() + "\n" +
                doublyLinkedList.poll() + "\n");

        System.out.println("Test ListIterator : ");
        DoublyLinkedList d = new DoublyLinkedList();
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
