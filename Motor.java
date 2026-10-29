package sedmaNedelja;

public class Motor extends Vozilo implements Ekonomican  {

	public Motor(int id, double maxBrzina) {
		super(id, 60);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenist) {
		// TODO Auto-generated method stub
		return udaljenist/maxBrzina;
	}

	@Override
	public double potrosnjaPoKilom() {
		// TODO Auto-generated method stub
		return 0.03;
	}

}
