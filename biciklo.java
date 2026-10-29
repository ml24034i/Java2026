package sedmaNedelja;


 class Biciklo extends Vozilo implements Ekonomican {
	
	//konstruktor 
	public Biciklo(int id, double maxBrzina) {
		super(id, 20);
		// TODO Auto-generated constructor stub
	}
	
	public double izracunajVrijemeDostave(double udaljenist) {// implemetirali smo biciklo
		return  udaljenist/maxBrzina;
	}	
@Override
	public double potrosnjaPoKilom() { // sa interfejsom 
		return 0; 
		
			

		
	}

}




   