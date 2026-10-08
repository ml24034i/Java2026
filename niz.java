package Predavanje;

import java.util.Random;
import java.util.Scanner;

public class niz {
	public static void main(String []args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Unesite broj clanova niza");
		int n = sc.nextInt();      //duzina niza
		double niz[]= new double[n];//double moramo zato sto imamo random opciju 
		
		Random random = new Random();// sluzi da mi dosli random brojevi
		
	      for (int i = 0; i<n; i++) {//ovako prolazimo kroy niy for petljom
	    	  niz[i]=random.nextInt();
	    	  }
	      
		  for(int k=0; k<n;k++)
	    	 System.out.println (niz[k]);
		  sc.close();
	
	}

}
