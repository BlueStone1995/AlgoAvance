package TP1;

import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un entier : ");
        int n = sc.nextInt();

        System.out.println(factorielle(n));

    }


    /**
     * Exo 1 : Fonctions basique
     */
    public static int factorielle(int n) {
        if (n == 0) {
            return 1;
        }

        return factorielle(n - 1) * n;
    }

    public static int puissance(int n, int p) {
        if (p == 0) {
            return 1;
        }

        return puissance(n, p - 1) * n;
    }

    /**
     * Exo 2 : Montée et descente
     */
    public static int descente(int n) {
        if (n <= 0) {
            affiche(0);
            return 0;

        }

        affiche(n);
        return descente(n - 1);
    }

    public static int aux(int i, int n) {
        if (i < n) {
            affiche(i);
            i++;
            aux(i, n);
        }
        return n;

    }

    public static void monte(int n) {
        if (n <= 0) {
            affiche(0);
        }

        int i = 0;
        System.out.println(aux(i, n));

    }

    public static void auxRebond(int i, int p, int n) {
        if (i == n && p == 1) {
            System.out.println(n);
        } else {
            if (i == 0 && p == -1) {
                System.out.println(0);
            } else {
                System.out.println(i);
                auxRebond(i + p, p, n);
            }
        }
    }


    public static void rebond(int n) {
        auxRebond(n, -1, n);
    }

    public static void affiche(int a) {
        System.out.println(a);
    }

    /**
     * Trie Fusion
     */

    //Tri fusion complexité nlog(n)
    public static void fusion(int[] t, int deb1, int fin1, int fin2) {
        //On récupère début et fin des deux tableaux
        int deb2 = fin1 + 1;

        //On crée nouveau tableau de taille équivalent à mon tab1
        int[] tab = new int[fin1 - deb1 + 1];
        for (int i = deb1; i <= fin1; i++) {
            tab[i - deb1] = t[i];
        }

        int compt1 = deb1;
        int compt2 = deb2;

        for (int j = deb1; j <= fin2; j++) {//Parcours tableau entier
            if (compt1 == deb2) {//Fin tableau de gauche
                break;
            } else if (compt2 == (fin2 + 1)) {//Fin tableau de droite, je recopie alors le reste dans mon tableau t
                t[j] = tab[compt1 - deb1];
                compt1++;
            } else if (tab[compt1 - deb1] < t[compt2]) {//Complète mon tableau t en foction du + petit
                t[j] = tab[compt1 - deb1];
                compt1++;
            } else {
                t[j] = t[compt2];
                compt2++;
            }
        }
    }

    //Méthode principale
    public static void triFusion(int[] t, int deb, int fin) {
        if (deb != fin) {

            //On sépare le tableaux en 2
            int mil = (deb + fin) / 2;

            //On sépare chaque tableaux pour se retrouver avec un seul élement de façon récursive
            triFusion(t, deb, mil);
            triFusion(t, mil + 1, fin);

            //On fusionne les tableaux et/ou cellule du tableaux
            fusion(t, deb, mil, fin);
        }
    }


}
