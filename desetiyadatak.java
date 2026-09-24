package prviCas;

public class desetiyadatak {
	public static void main (String [] args) {  
		
		int broj = 12345;
		int poslednja = broj%10;
		int predposlednja = (broj/10)%10;
		
		System.out.println(predposlednja + poslednja);

	}

}
