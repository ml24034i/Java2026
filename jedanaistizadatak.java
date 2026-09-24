package prviCas;

public class jedanaistizadatak {
	public static void main (String [] args) { 
		int broj = 57;
		int a = broj/10;
		int b= broj%10;
		if (a>b){
			int rez = a-b;
			System.out.println("razlika cifara je "+ rez );
		}
		else if (b>a) {
			int zbir = a+b;
			System.out.println("zbir cifara je "+ zbir);
		}
		else {
			int proizvod = a*b;
			System.out.println("proizvod je "+proizvod);
			
					
				
				
		}
	}

}
