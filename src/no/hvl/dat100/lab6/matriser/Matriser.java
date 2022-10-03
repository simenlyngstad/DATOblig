package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)

	public static void skrivUtv1(int[][] matrise) {

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				System.out.print(matrise[rad][kol] + " ");
			}
			System.out.println();

		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String returVerdi = "";

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				returVerdi = returVerdi + matrise[rad][kol] + " ";
			}
			returVerdi = returVerdi + "\n";

		}
		return returVerdi;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] matrise2 = new int[matrise.length][matrise[0].length];
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {

				matrise2[rad][kol] = matrise[rad][kol] * tall;
			}
		}
		return matrise2;
	}
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean returVerdi = a.length == b.length;
		if (returVerdi) {
			for (int rad = 0; rad < a.length && returVerdi; rad++) {
				returVerdi = a[rad].length == b[rad].length;
				for (int kol = 0; kol < a[rad].length && returVerdi; kol++) {
					returVerdi = a[rad][kol] == b[rad][kol];

				}
			}

		}
		return returVerdi;
	}
}