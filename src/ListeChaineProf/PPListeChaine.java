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
        sl.add("F");
        sl.add("G");
        sl.add("H");
        sl.add("I");
        sl.add("J");
        sl.add("K");
        sl.add("L");
        sl.add("M");
        sl.add("N");

        System.out.println(sl.getContenu().getSuivant().getData());

        sl.addEnTete("O");
        sl.addEnTete("P");
        sl.addEnTete("Q");
        sl.addEnTete("R");
        sl.insert(5, "simpleList n°6");
        sl.insert(2, "2");
        sl.remove(1);
        sl.remove(0);

        SimpleList slb = new SimpleList();
        slb.addEnTete("Z");
        slb.add("Y");
        slb.add("X");
        sl.addAll(slb);

        sl.addEnTete("position 0");
        slb.addEnTete("position 0");

        System.out.println(
                sl.contains("E") + "\n" +
                        sl.contains("A") + "\n" +
                        sl.contains("K") + "\n" +
                        sl.contains("S") + "\n" +
                        sl.contains("Bob") + "\n" +
                        sl.contains("Z") + "\n" +
                        sl.contains("y")
        );


        System.out.print("Contenus : [ ");

        Iterator<String> itr = sl.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
