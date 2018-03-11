package DoublyLinkedListGenerique;

import java.util.ListIterator;
import DoublyLinkedListGenerique.DoublyLinkedListGenerique;

public class PPDoublyLinkedListGenerique {

    public static void main(String args[]) {

        DoublyLinkedListGenerique<String> stringDoublyLinkedListGenerique = new DoublyLinkedListGenerique<String>();

        stringDoublyLinkedListGenerique.addFirst("A");
        stringDoublyLinkedListGenerique.addLast("B");
        stringDoublyLinkedListGenerique.addLast("C");
        stringDoublyLinkedListGenerique.addLast("D");
        stringDoublyLinkedListGenerique.addLast("E");
        stringDoublyLinkedListGenerique.removeFirst();
        stringDoublyLinkedListGenerique.remove(1);

        System.out.println("Test contains : ");
        System.out.println(
                "A est dans stringDoublyLinkedListGenerique : " + stringDoublyLinkedListGenerique.contains("A") + "\n" +
                        "B est dans stringDoublyLinkedListGenerique : " + stringDoublyLinkedListGenerique.contains("B") + "\n" +
                        "S est dans stringDoublyLinkedListGenerique : " + stringDoublyLinkedListGenerique.contains("S") + "\n" +
                        "F est dans stringDoublyLinkedListGenerique : " + stringDoublyLinkedListGenerique.contains("F") + "\n"
        );

        ListIterator<String> listIterator = stringDoublyLinkedListGenerique.iterator();

        // Affichage
        System.out.print("[ " + stringDoublyLinkedListGenerique.getTete().getData() + " ");
        while (listIterator.hasNext()) {

            System.out.print(listIterator.next() + " ");
        }
        System.out.println("]\n");


        System.out.println("Test push, peek et poll : ");
        stringDoublyLinkedListGenerique.push("début");
        System.out.println(stringDoublyLinkedListGenerique.peek() + "\n" +
                stringDoublyLinkedListGenerique.poll() + "\n");

        System.out.println("Test ListIterator : ");
        DoublyLinkedListGenerique<String> d = new DoublyLinkedListGenerique<String>();
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
