package sedmaNedelja;

public class DostavaDomo {

	public static void main(String[] args) {
	
		Vozilo[] vozila = new Vozilo[3];
		vozila[0]=new Biciklo(321,20);  // 0 je jer indeksiranje u javi pocinje od 0
		vozila[1] = new Motor(543,60);
		vozila[2] = new Automobil(999,80);
		
		double udaljenost = 10.0;
		for( Vozilo  v : vozila) {
			v.info();
			if( v instanceof Ekonomican) { // ovo instance koristimo da bi provjeravamo da li je ekonomicno
				Ekonomican e = (Ekonomican) v; 
				double ukupnaPotrosnja = e.potrosnjaPoKilom()*udaljenost; //
				System.out.println("Ukupna potrosnja na"+udaljenost+"kilometara je" +ukupnaPotrosnja);}
		
			
		}
		

	}

}
