package osmanedelja;

import java.util.Scanner;

public class zadatak1sakolokvijuma { //kako pretvoriti binarne u oktalne 

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("unesi prirodan broj");
		int n  = sc.nextInt() ;
		
		String oktalni = "";
		
		while (n>0) {
			oktalni = (n%8) + oktalni;
			n=n/8;
			
		}
		System.out.println("Binarno"+oktalni);
		
		sc.close();
		}
			
	}


