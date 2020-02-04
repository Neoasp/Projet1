package com.formation;

import java.util.ArrayList;
import java.util.List;

public class Principale2 {

	public static void main(String[] args) {
		
		
		
		long n = 1048;
		System.out.println("Le resultat est : " + decomposer(n));
	}

	public static List<Long> decomposer(Long n) {
		
		//declaration de la liste (tableau) resultat
		List<Long> resultat = new ArrayList<>();
		
		//declaration du diviser initial
		long diviser = 2;
		while (n>1) {
			// si n est divisible par le diviseur
			if (n % diviser == 0) {
				// memorise le diviseur dans le resultat
				resultat.add(diviser);
				
				n = n / diviser;
			} else {
				diviser = diviser + 1;
			}
		}
		return resultat;
		
	}

	
	
}
