package ArrayList;

public class PPIntArrayList {

    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(i + 2);
        }

        System.out.println(
                intArrayList.add(11) + "\n" +
                        intArrayList.add(0, 9) + "\n" +
                        intArrayList.contains(3) + "\n" +
                        intArrayList.get(4) + "\n" +
                        intArrayList.indexOf(6) + "\n" +
                        intArrayList.isEmpty() + "\n" +
                        intArrayList.size() + "\n" +
                        intArrayList.remove(11)
        );

        StringArrayList sal = new StringArrayList();

        for (int j = 0; j < 10; j++) {
            sal.add("A");
        }

        //for(element : sal.iterator()){}
    }
}
