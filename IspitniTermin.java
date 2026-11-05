package osmanedelja;
import java.util.ArrayList;


public class IspitniTermin {
	
	private String nazivPredmeta;
	private String sifraTermina;
	private String DdatumVrijemeTermina;
	private String oznakaSale;
	private int brojPrijavljenihStudenata;
	
	
	public IspitniTermin (String nazivPredmeta, String sifraTermina, String ddatumVrijemeTermina,
			String oznakaSale, int brojPrijavljenihStudenata) {
		super();
		this.nazivPredmeta = nazivPredmeta;
		this.sifraTermina = sifraTermina;
		DdatumVrijemeTermina = ddatumVrijemeTermina;
		this.oznakaSale = oznakaSale;
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
		
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getSifraTermina() {
		return sifraTermina;
	}

	public void setSifraTermina(String sifraTermina) {
		this.sifraTermina = sifraTermina;
	}


	public String getDdatumVrijemeTermina() {
		return DdatumVrijemeTermina;
	}

	public void setDdatumVrijemeTermina(String ddatumVrijemeTermina) {
		DdatumVrijemeTermina = ddatumVrijemeTermina;
	}

	public String getOznakaSale() {
		return oznakaSale;
	}

	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}


	public int getBrojPrijavljenihStudenata() {
		return brojPrijavljenihStudenata;
	}

	public void setBrojPrijavljenihStudenata(int brojPrijavljenihStudenata) {
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}
	
	

	@Override
	public String toString() {
		return "IspitniTermin [nazivPredmeta=" + nazivPredmeta + ", sifraTermina=" + sifraTermina
				+ ", DdatumVrijemeTermina=" + DdatumVrijemeTermina + ", oznakaSale=" + oznakaSale
				+ ", brojPrijavljenihStudenata=" + brojPrijavljenihStudenata + "]";
	}


	public static String pronadjiSalu (ArrayList<IspitniTermin> lista,String sifraTermina) {
		
		String out = "";
		for (IspitniTermin z : lista) {
			if(z.getSifraTermina().equals(sifraTermina));
			return z.getOznakaSale();
			
			
        }
  return out;
	}
		public static void pronadjiBrojPrijavljenihStudenata  (ArrayList<IspitniTermin> lista,String nazivPredmera) {
			int out = 0;
			for(IspitniTermin z:lista) {
				if(z.getNazivPredmeta().equals(nazivPredmera))
				out++;
			}
			
        
       
    }
	
	

}
