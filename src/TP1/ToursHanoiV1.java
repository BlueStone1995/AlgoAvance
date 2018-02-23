package TP1; /**
 * TP1 - Tour de Hanoi
 *
 */

import java.util.Scanner;

public class ToursHanoiV1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer nombre de plateau : ");
        int n = sc.nextInt();

        System.out.println("Nombre de plateau utilisés : " + n + "\n" +
                "Emplacement de départ : G " + "\n" +
                "Emplacement d'arrivée : D" + "\n" +
                "Emplacement intermédiaire : M");

        hanoiV1(n, "G", "M", "D");
    }

    // Première version :
    public static void hanoiV1(int n, String dep, String tmp, String dest) {
        if (n == 0) return; //Stop

        hanoiV1(n - 1, dep, dest, tmp);
        System.out.println("Déplacez le plateau " + n + " de la tour " + dep + " à la tour " + dest);
        hanoiV1(n - 1, tmp, dep, dest);
    }


}
