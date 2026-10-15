package PetaNedelja;

import java.util.Scanner;

public class devetizadatak {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in); 
	        String s = sc.next().trim();
	        
	        StringBuilder novi = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) { 
	            char ch = s.charAt(i); 
	            int d = ch - '0'; 
	         
	            if (d % 2 == 0) {
	                novi.append('0');
	            } else {
	                novi.append('1');
	            }
	        } 
	        
	        System.out.println(novi.toString()); 
	        sc.close();

	
		
	}
}
