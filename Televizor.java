package trecicetvrticas;

public class Televizor {
	private int brojKanala;
    private String nazivKanala;
    private int jacinaTona;
	
   public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
	   setBrojKanala(brojKanala);
        this.nazivKanala = nazivKanala;
        setJacinaTona(jacinaTona);
   }

	public int getBrojKanala() {
		return brojKanala;
	}
	public void setBrojKanala(int brojKanala) {
		 if (brojKanala >= 1) {
	            this.brojKanala = brojKanala;
	        } else {
	            System.out.println("Broj kanala mora biti veci ili jedan od 1");
	            this.brojKanala=1;
	        }
	       
	}
	public String getNazivKanala() {
		return nazivKanala;
	}
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	public int getJacinaTona() {
		return jacinaTona;
	}
	public void setJacinaTona(int jacinaTona) {
		   if (jacinaTona >= 0 && jacinaTona <= 10) {
	            this.jacinaTona = jacinaTona;
	        } else {
	        	if(jacinaTona<0) {
	        		this.jacinaTona=0;
	        	}
	        	if(jacinaTona>0) {
	        		this.jacinaTona=10;
	        	}
	        }
	}
	
	 public void smanjiTomn() {
	        if (jacinaTona < 10) {
	            jacinaTona--;
	            System.out.println("Ton je smanjen na : "+this.jacinaTona);

	        } else {
	            System.out.println("Jacina tona je već na minimumu.");
	        }
	    }
	 
	
	

	
	 public void pojacajTon() {
	        if (jacinaTona < 10) {
	            jacinaTona++;
	            System.out.println("Ton je povecan na"+this.jacinaTona);

	        } else {
	            System.out.println("Jacina tona je već na maksimumu.");
	        }
	    }
	 
	
	 
	 public void ispisi() {
	        System.out.println("Broj kanala: " + brojKanala);
	        System.out.println("Naziv kanala: " + nazivKanala);
	        System.out.println("Jacina tona: " + jacinaTona);
}
}
