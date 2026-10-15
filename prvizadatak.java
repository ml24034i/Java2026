package PetaNedelja;

import java.util.Scanner;

// split sluzi da dijelimo string vise djelova na osnovu zadatog graničnika  i od tih dijelova pravi listu ili niz.
// Regex(regularni izraz)- Pomoću njih ne tražite tačno određenu riječ (npr. "Petar"), već pravilo ili strukturu teksta koji vas zanima.

public class prvizadatak {

	public static void main (String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("unesi recenicu");
		
		String recenica = sc.nextLine().trim();// .trim nam mice sa pocetka i sa kraja space
		
		String[]rijeci = recenica.split("\\s+");
		System.out.println("Ukupan broj rijeci je:"+ rijeci.length);
		
		sc.close();
			
		
	}
}
