package ListeChaine;

import java.util.Iterator;

public class PPListeChaine {

    public static void main(String args[]) {

        SimpleList sl = new SimpleList();
        sl.addEnTete("A");
        sl.add("B");
        sl.add("C");
        sl.add("D");
        sl.add("E");

        sl.insert(2, "S");

        SimpleList slb = new SimpleList();
        slb.addEnTete("X");
        slb.add("Y");
        slb.add("Z");
        slb.insert(1, "P");
        //slb.addEnTete("E");
        slb.remove(2);


        sl.addAll(slb);

        sl.addEnTete("O");
        slb.addEnTete("Chiffre");

        System.out.println(
                "A est dans sl : " + sl.contains("A") + "\n" +
                        "F est dans sl : " + sl.contains("F")
        );

        System.out.println(
                "A est dans slb : " + slb.contains("A")
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
