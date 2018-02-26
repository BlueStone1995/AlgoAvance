package ListeChaineProf;

import java.util.Iterator;

public class PPListeChaine {

    public static void main(String args[]) {
        SimpleList sl = new SimpleList();

        sl.addEnTete("A");
        sl.add("B");
        sl.add("C");
        sl.add("D");
        sl.add("E");
        sl.addEnTete("O");
        sl.addEnTete("P");

        sl.insert(5, "S");
        sl.insert(2, "V");
        sl.remove(1);
        sl.remove(0);

        SimpleList slb = new SimpleList();
        slb.addEnTete("X");
        slb.add("Y");
        slb.add("Z");

        sl.addAll(slb);

        sl.addEnTete("OK");
        slb.addEnTete("Chiffre");

        System.out.println(
                sl.contains("A") + "\n" +
                        sl.contains("B") + "\n" +
                        sl.contains("O") + "\n" +
                        sl.contains("P") + "\n" +
                        sl.contains("Bob") + "\n" +
                        sl.contains("X") + "\n" +
                        sl.contains("Y")
        );


        // Affichage via Iterator
        System.out.print("Contenus sl : [ ");

        Iterator<String> itr = sl.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println("]");


        System.out.print("Contenus slb : [ ");

        Iterator<String> itrb = slb.iterator();

        while (itrb.hasNext()) {
            String element = itrb.next();
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
