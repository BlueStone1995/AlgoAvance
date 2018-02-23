package TP1;

import java.util.Scanner;

public class ToursHanoiV2 {
    private static int n;
    private static int i = 0;
    private static int j = 0;
    private static int dep = 0;
    private static int inter = 1;
    private static int dest = 2;
    private static int nombreDisque;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Veuillez choisir un nombre de disques :");
        n = sc.nextInt();
        nombreDisque = n;
        int Tab[][] = new int[3][n];
        System.out.println("Tours de Hanoï");
        System.out.println("--------------------");
        remplirTab(Tab);
        afficherJeu(Tab);
        hanoiv2(n, Tab);
    }

    public static void hanoiv2(int n, int[][] Tab) {

        hanoiRecursif(Tab, dep, inter, dest, n);
    }

    public static void hanoiRecursif(int Tab[][], int dep, int inter, int dest, int n) {
        if (n > 0) {
            hanoiRecursif(Tab, dep, dest, inter, n - 1);
            deplacer(Tab, dep, dest, n);
            hanoiRecursif(Tab, inter, dep, dest, n - 1);
        }

    }

    public static void remplirTab(int Tab[][]) {
        if (i == 0) {
            for (j = 0; j < n; j++) {
                Tab[i][j] = j + 1;
            }
            i++;
            remplirTab(Tab);

        } else {
            for (j = 0; j < n; j++) {
                Tab[i][j] = 0;
            }
            i++;
            if (i < 3) {
                remplirTab(Tab);

            }
        }

    }

    public static void afficherJeu(int Tab[][]) {
        for (j = 0; j < n; j++) {
            for (i = 0; i < 3; i++) {
                System.out.print(Tab[i][j]);
                System.out.print("       ");
            }
            System.out.println();
        }
    }

    public static void deplacer(int Tab[][], int dep, int dest, int n) {
        System.out.println("--------------------");
        int disque = 0;
        int tmp;
        while (Tab[dep][disque] == 0) {
            disque++;
        }

        tmp = Tab[dep][disque];
        Tab[dep][disque] = 0;
        disque = nombreDisque - 1;

        while (Tab[dest][disque] != 0) {
            disque--;
        }

        Tab[dest][disque] = tmp;
        System.out.println("Deplacement du disque " + n + " de la tour " + (dep + 1) + " à la tour " + (dest + 1));
        afficherJeu(Tab);
    }

}
   



        


