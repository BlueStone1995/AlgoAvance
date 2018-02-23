package TP1;

import java.util.Arrays;

public class Tatata {

	public static void main(String[] args) {
		int x = 5;
		int a = plouf(x); // a vaut 4. Mais x n'est pas modifié.
		System.out.println(x);
		
		int y[] = {5};
		plaf(y);
		System.out.println(y[0]);
	}
	
	public static int plouf(int y) {
		y = 3;
		return 4;
	}
	public static int plaf(int [] x) {
		x[0] = 3;
		return 4;
	}
}
