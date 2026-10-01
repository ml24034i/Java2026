package trecicetvrticas;


public class Zaposleni2 {

	private String ime;
	private String prezime;
    private int godine_staza;
    private double plata;
    

	public Zaposleni2(String ime, String prezime, int godine_staza, double plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodine_staza() {
		return godine_staza;
	}

	public void setGodine_staza(int godine_staza) {
		if(godine_staza<0) {
			System.out.println("ne moze biti negativna");
			this.godine_staza=0;
		}else {
			this.godine_staza=godine_staza;
		}
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
    
    
	
	public void ispisi() { 
		System.out.println("Zaposleni:"+ime+prezime+ " u nasoj firmi radi: "+godine_staza+" godina.");
	}
	
	
	
	
	
	    public void povecajPlatu() {
	        if (this.plata < 800 && this.godine_staza > 10) {
	        	
	           double staraplata = this.plata;
	           double novaplata = staraplata*1.06;
	           System.out.println("Stara plata od " +staraplata +"je povecana na" + novaplata);
	        }else {
	        	System.out.println("ne ispunjavate uslove za povecanje plate");
	        }
	    }

}
