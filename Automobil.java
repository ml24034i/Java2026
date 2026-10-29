package sedmaNedelja;

public class Automobil extends Vozilo  implements Ekonomican  {

	public Automobil(int id, double maxBrzina) {
		super(id, 80 );
		// TODO Auto-generated constructor stub
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenist) {
		// TODO Auto-generated method stub
		return udaljenist / maxBrzina;
	}

	@Override
	public double potrosnjaPoKilom() {
		// TODO Auto-generated method stub
		return 0;
	}

}
