package PetaNedelja;


import java.util.Scanner; 

public class sedmizadatak {
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		System.out.println("unesi recenicu");
		
		String rijec = sc.nextLine();
		String[] rijeci = rijec.split(" ");
		
		StringBuilder novaRijec  = new StringBuilder();
		 for (int i =0; i<rijeci.length;i++) {
	    	  String rijec1 = rijeci[i];
	    	 
	    	  
		    	  
	 StringBuilder obrnuto = new StringBuilder(rijec1).reverse(); 
		            novaRijec.append(obrnuto); 
		            
		            if (i < rijeci.length - 1) {
		            	novaRijec.append(" "); 
		        } 
		        System.out.println(novaRijec.toString());  
		 	    
	sc.close();
		
		
	}

}
}