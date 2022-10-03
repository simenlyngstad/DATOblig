package no.hvl.dat100.lab5.tabeller;

import no.hvl.dat100.lab5.*;
import no.hvl.dat100.lab5.tabeller.*;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
				
		int[] tabell1 = new int[]{ 1,2,3,4,5,6,7,8,9 };
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Elementet i indeks " + i + " er " + tabell1[i]);
		}
		Tabeller.skrivUt(tabell1);
					
	}

	// b)
	
	public static void tilStreng(int[] tabell) {
		
		int[] Tab1 = new int[] { 45, 67, 89 };
		
		for(int nummer : Tab1) {
			System.out.println(nummer);
		}
		Tabeller.tilStreng(tabell);
	}

	// c)
	public static int summer(int[] tabell) {
		int summer = 0;
		
		
		int[] tabell1 = new int[] {2, 4, 6, 8 };
		
		for(int k = 0; k < tabell1.length; k++) {			
			summer+= tabell1[k];
			
		}
		Tabeller.summer(tabell1);
		System.out.println("Summen av tabellen er " + summer(tabell1));
		return summer;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int[] tabell1 = {2, 5, 7, 9};
		int tall1 = 7;
		String s = "Tallet ";
		String d = " befinner seg i tabellen.";
		
		boolean funnet = false;
		for(int i = 0; i < tabell1.length; i++) {
			if(tabell1[i] == tall1) {
				funnet = true;
				System.out.println(s + tall1 + d);
				}	
			}
		Tabeller.finnesTall(tabell1, tall1);
		System.out.println(Tabeller.finnesTall(tabell1, tall1));
			return funnet;
		
		} 

	// e)
	public static int posisjonTall(int[] tabell, int tall) {		
		if(tabell == null) {
			return -1;
		}
		int lengde = tabell.length;
		int i = 0;
		
		while(i < lengde) {
			if(tabell[i] == i) {
				return i;
			} else {
				i = i + 1;
			}
		}
		Tabeller.posisjonTall(tabell, tall);
		System.out.println(Tabeller.posisjonTall(tabell, tall));
		return -1;
	}		
	// f)
	public static int[] reverser(int[] tabell) {
		int[] Tabell = {2, 3, 4, 9, 10};
		
			int n = 0;
			int i = 0;				        
	        int j = 0;
	        int k = 0;
	        
	        for (i = 0; i < n; i++) {
	            Tabell[j - 1] = Tabell[i];
	            j = j - 1;
	        }
	        for(k = 0; k < n; k++) {
	            System.out.println(Tabell[k]);
	        }
	        Tabeller.reverser(Tabell);
			return Tabell;
	    }	
	
	// g)
	
	public static boolean erSortert(int[] tabell) {	
		int[] Tabell = {2, 4, 6, 8};
			
			
		if(Tabell == null || Tabell.length <= 1) {
			return true;
		}
		for (int i = 0; i < Tabell.length - 1; i++) {
            if (Tabell[i] > Tabell[i + 1]) {
                return false;
            }
        }
		Tabeller.erSortert(Tabell);
		System.out.println(Tabeller.erSortert(Tabell));
		return true;
	}
	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] TabellA = { 2, 3, 6, 9};
		int[] TabellB = { 2 , 6, 9, 10};
		
		int nyTabell = TabellA.length + TabellB.length;
		int[] nyTab = new int[nyTabell];
		for(int i = 0; i < TabellA.length; i++) {
			nyTab[i] = TabellA.length;
		}
			for(int j = 0; j < TabellB.length; j++) {
				nyTab[TabellA.length+j] = TabellB[j];
			}
			Tabeller.settSammen(tabell1, tabell2);
			System.out.println(Tabeller.settSammen(nyTab, null));
			return nyTab;
	}
}