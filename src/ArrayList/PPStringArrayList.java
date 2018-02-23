package ArrayList;

import java.util.Iterator;

public class PPStringArrayList {

    public static void main(String args[]) {

        StringArrayList al = new StringArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add("F");
        al.add(16, "F");
        System.out.println(
                al.contains("E") + "\n" +
                        al.contains(2) + "\n" +
                        al.indexOf(23) + "\n" +
                        al.indexOf("F") + "\n" +
                        al.isEmpty() + "\n" +
                        al.remove(3) + "\n" +
                        al.set(0, "Z") + "\n" +
                        al.size()
        );


        System.out.print("Contenus : [ ");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
