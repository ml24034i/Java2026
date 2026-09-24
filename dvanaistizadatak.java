package prviCas;

public class dvanaistizadatak {
	public static void main (String [] args) {  
		int r1 = 5;
		int r2 = 7;
		double p1= r1*r1*Math.PI;
		double p2=r2*r2*Math.PI;
		
		if(p1>p2) {
			double obim=2*r1*Math.PI;
			System.out.println("Obim stola sa vecom "+obim);
		}else {
			double obim = 2*Math.PI*r2;
			System.out.println("obim stola sa vesom "+obim);
		
			
			
		}
		
		
		
	}

}
