package ListeChaine;

import java.util.Iterator;

public class PPListeChaine {

    public static void main(String args[]) {

        SimpleList sl = new SimpleList();
        sl.addEnTete("A");
        sl.addEnTete("-1");
        sl.add("B");
        sl.add("C");
        sl.add("D");
        sl.add("E");

        sl.insert(6, "Nop");
        sl.insert(20, "Nop");
        sl.insert(3, "S");
        sl.insert(-1, "Nop");
        sl.remove(7); // Nop
        sl.remove(0);

        SimpleList slb = new SimpleList();
        slb.addEnTete("X");
        slb.add("Y");
        slb.add("Z");
        slb.insert(1, "P");

        slb.remove(0);

        sl.addAll(slb);

        System.out.println(
                "A est dans sl : " + sl.contains("A") + "\n" +
                        "-1 est dans sl : " + sl.contains("-1") + "\n" +
                        "S est dans sl : " + sl.contains("S") + "\n" +
                        "F est dans sl : " + sl.contains("F")
        );

        System.out.println(
                "A est dans slb : " + slb.contains("A")
        );


        // Affichage via Iterator
        Iterator<String> itr = sl.iterator();

        System.out.print("Contenus sl : [ " + sl.getContenu().getData() + " ");

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println("]");


        Iterator<String> itrb = slb.iterator();

        System.out.print("Contenus slb : [ " + slb.getContenu().getData() + " ");

        while (itrb.hasNext()) {
            String element = itrb.next();
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
