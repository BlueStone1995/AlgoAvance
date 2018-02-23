package TP1;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class Fibonacci {

    public static void main(String[] args) {
        //for (int i=0;i<1000;i++) {
        //System.out.println(fibo(40));
        System.out.println(fibo2(1000));
        //System.out.println(fibo3(500));
        //}
    }

    // l'utilisation de int limite les possibilités de calcul à fibo(46).
    // Au-delà on dépasse les capacités du type. D'où l'usage de long.
    public static long fibo(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // Pour autant le temps de calcul explose pour fibo(50), 60, etc.
    // Notre programme n'est pas de complexité linéaire.
    // Le nombre d'appels récursifs croit très très vite (de manière exponentielle).


    // Dans la solution suivante on s'affranchit eds limites du type en utilisant BigInteger
    // pour calculer les valeurs de la suite.
    // Et on utilise un TreeMap qui est simplement un système d'association clé/valeur:
    // - put(int n, BigInteger m) ajoute la valeur m associée à la clé n
    // - containsKey(int n) permet de teste rl'existence de la clé n
    // - get(int n) permet de récupérer la valeur associée à la clé n

    public static String fibo2(int n) {
        return (fib(n, new TreeMap<Integer, BigInteger>())).toString();
    }

    public static BigInteger fib(int n, Map<Integer, BigInteger> map) {

        if (n == 0) {
            return BigInteger.valueOf(0); // crée le BigInteger 0
        }

        if (n == 1) {
            return BigInteger.valueOf(1); // crée le BigInteger 1
        }

        if (map.containsKey(Integer.valueOf(n))) { // SI il y a une entrée de clé n dans le map
            return map.get(Integer.valueOf(n)); //on retourne la valeur du map associée à n
        }

        map.put(Integer.valueOf(n), fib(n - 1, map).add(fib(n - 2, map))); // On ajoute dans le map, à la clé n, le BigInteger qui correspond à fibo(n)
        return map.get(Integer.valueOf(n));
    }


    // Enfin dans celle-ci, notre fonction récursive ne retrourne pas 1 mais 2
    // résultats, sous forme d'un tableau. Ainsi en un seul appel récursif,
    // auxfibro3(n) récupère à la fois fibo(n-1) et fibo(n-2). Et elle retourne
    // elle-même fibo(n) et fibo(n-1).
    // Ce programme a une complexité linéaire. On peut le réécrire avec des
    // BigInteger pour s'affranchir de la limite du type.

    public static long fibo3(int n) {

        return auxfibo3(n)[1];
    }

    public static long[] auxfibo3(int n) {
        if (n == 0) {// sert uniquement si on appelle directement fibo3(0)
            long[] x = {0, 0};
            return x;
        }

        if (n == 1) {    // le seul cas limite au sens propre
            long[] x = {0, 1};
            return x;
        } else {
            long[] x = auxfibo3(n - 1);
            long[] y = {x[1], x[0] + x[1]};
            return y;
        }
    }

}
