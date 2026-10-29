package sedmaNedelja;

public abstract class Vozilo {
	    protected int id;// protected koristimo da bi mogli da pristupamo u podklasama 
	    protected  double maxBrzina;
		
  //Konstruktor
	    
	   public Vozilo(int id, double maxBrzina) {
			super();
			this.id = id;
			this.maxBrzina = maxBrzina;
		} 
	   
 // obicna metoda info() koja  ispisuje osnovne podatke o vozilo 
	   
	   public void info() {
	        System.out.println("ID vozila je : " + id + ", Maksimalna brzina: " + maxBrzina + " km/h");
	   
	   }
	   public abstract double izracunajVrijemeDostave(double udaljenist) ;
	   
	   
	   }
		  
		   
	 



