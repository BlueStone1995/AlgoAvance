package TP1;

import java.util.Scanner;

public class TrieFusion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = {4, 2, 1, 9, 10, 34, -1};


        trieFusion(tab, 0, tab.length);

    }


    public static int[] fusion(int[] t, int deb1, int fin1, int fin2) {
        int deb2 = fin1 + 1;

        //Copie mon tableaux de gauche dans tmp
        int[] tmp = new int[fin1 - deb1];
        int tmpLength = tmp.length;

        for (int i = 0; i < tmpLength; i++) {
            tmp[i - deb1] = t[i - deb1];
        }

        int compt1 = deb1;
        int compt2 = deb2;

        for (; ; ) {
            System.out.println(compt1 + " " +  compt2 + " " + deb1 + " " + deb2 + " " + tmp.length + " " +  t.length);
            if (compt1 == deb2) { //Fin de mon tableau 1
                return t;
            } else if (compt2 == fin2 + 1) { //Fin de mon tableau 2
                t[compt1] = tmp[compt1 - deb1];

                return t;
            } else if (tmp[compt1 - deb1] < t[compt2 - deb2]) { //
                t[compt1] = tmp[compt1 - deb1];
                compt1++;
            } else {
                t[compt1] = t[compt2];
                compt2++;
            }
        }
    }

    private static void trieFusion(int[] tab, int deb, int fin) {
        if (deb == fin) {
            return;
        }

        int mil = (deb + fin) / 2;
        trieFusion(tab, deb, mil);
        trieFusion(tab, mil + 1, fin);

        fusion(tab, deb, mil, fin);
    }


}
