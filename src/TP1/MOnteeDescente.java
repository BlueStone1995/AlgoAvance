package TP1;

public class MOnteeDescente {


    public static void main(String[] args) {
        rebond(10);
    }

    // deux solutions pour montee :
    // une solution directe
    public static void montee(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            montee(n - 1);
            System.out.println(n);
        }
    }

    // une solution avec aux
    public static void montee2(int n) {
        aux(0, n);
    }

    public static void aux(int i, int n) {
        if (i == n) {
            System.out.println(n);
        } else {
            System.out.println(i);
            aux(i + 1, n);
        }

    }

    // dans auxRebond le troisième paramètre correspond au sens dans lequel évolue i.
    public static void rebond(int n) {

        auxRebond(n, -1, n);
    }

    public static void auxRebond(int i, int p, int n) {
        if (i == n && p == 1) {
            System.out.println(n);
        } else {
            if (i == 0) {
                System.out.println(0);
                auxRebond(1, 1, n);
            } else {
                System.out.println(i);
                auxRebond(i + p, p, n);
            }
        }
    }
}
