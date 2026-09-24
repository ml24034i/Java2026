package prviCas;
import java.util.Scanner; 

public class trinarstizadatak {
	public static void main (String [] args) { 
		Scanner sc= new Scanner (System.in);
		System.out.println("unesite prvi broj:");
		          int prvi = sc.nextInt();
		System.out.println("unesite drugi broj:");
		          int drugi = sc.nextInt();
		System.out.println("unesite treci broj:");
		          int treci = sc.nextInt();          
		          
		          int min = prvi;
		          int max = prvi;
		          
		          if(drugi<min) {
		        	  min=drugi;
		          }
		          if (treci<min) {
		        	  min=treci;
		          }
		          if (drugi>max) {
		        	  max=drugi;
		        }
		          if (treci>max) {
		        	  max = treci;
		        }
		     System.out.println("minimum"+min);
		     System.out.println("maksimum"+max);
		        	  
		          }
		
	}


