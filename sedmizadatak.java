package prviCas;

public class sedmizadatak {
	public static void main (String [] args) { 
		
		double x1=1;
		double y1=2;
		
		double x2=5;
		double y2=3;
		
		double x3=(x1+x2)/2;
		double y3=(y1+y2)/2;
		
	    double udaljenostB = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
	    double udaljenostD= Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
	    
		System.out.println("Udaljenost izmedju studenata i sredine su: " + udaljenostD + "i:"+udaljenostB);
				
		
		
	}
}
