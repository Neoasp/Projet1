package com.formation;

public class Principale {

	public static void main(String[] args) {
	
		long n = 12;
		System.out.println(n + (estPremier(n) ? " est premier" : " n'est pas premier"));
	}

	public static boolean estPremier(long n) {
		
		long modulo = 0;
		for (long i = 2; i < n; i++ ) {
			modulo = n % i;
			
			if (modulo == 0) {
				return false;
			}
		}
		
		
		return true;
	}
	
}
