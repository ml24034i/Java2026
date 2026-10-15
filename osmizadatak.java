package PetaNedelja;

import java.util.Scanner;

public class osmizadatak {
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Unesite string");
	        String s = sc.nextLine();
           
	        System.out.print("Unesite indeks: ");
	        int pozicija = sc.nextInt();	           
	        int slobodnaPolja = 0;
	        
	     // Provjeravamo da li je unijeta pozicija validna u okviru stringa
	        if (pozicija < 0 || pozicija >= s.length()) {
	            System.out.println("Greška unijeli ste nevažeću poziciju!");
	        } else {
	            // 1. Ako NIJE prvo polje, provjeravamo lijevo polje (pozicija - 1)
	            if (pozicija > 0) {
	                if (s.charAt(pozicija - 1) == '0') {
	                    slobodnaPolja++;
	                }
	            }

	            // 2. Ako NIJE posljednje polje, provjeravamo desno polje (pozicija + 1)
	            if (pozicija < s.length() - 1) {
	                if (s.charAt(pozicija + 1) == '0') {
	                    slobodnaPolja++;
	                }
	            }

	            // Štampamo rezultat
	            System.out.println("Broj slobodnih susjednih polja je: " + slobodnaPolja);
	        }

	        sc.close();
}
}