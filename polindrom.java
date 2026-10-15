package PetaNedelja;

import java.util.Scanner;



public class polindrom {

	public static void main (String[] args) {
			
			Scanner sc  = new Scanner(System.in);
			System.out.println("Unesi recenicu");
	
	String recenica = sc.nextLine(); // unos teksta 
	
	
	StringBuilder sb  = new StringBuilder(recenica);
	String obrnuto = sb.reverse().toString(); 
	
	if (recenica.equalsIgnoreCase(obrnuto)) {
		
		System.out.println("Jeste polinrom");
	}
	else {
		System.out.println("nije polinrom");
		
		sc.close();
	}
	}
	
	
	
	
	


}
