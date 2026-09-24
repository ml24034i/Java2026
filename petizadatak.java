package prviCas;

public class petizadatak {
	public static void main (String [] args) {  
		
		int broj = 1234;
		int x = broj%10;
		int y = (broj/10)%10;
		int z = (broj/100)%100;
		int q = broj/1000;
		
		int zbir=x+y+z+q;
		int kvadrat = zbir*zbir;
		System.out.println("kvadrat zbira cifara broja je:"+ kvadrat);
			}

}
