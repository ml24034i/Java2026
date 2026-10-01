package trecicetvrticas;

public class player {
	


	private int x1;
	private int y1;
	private int width1;
	private int height1;
	private int health1;
	
	public player (int x1, int y1, int width1, int height1, int health1) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.width1 = width1;
		this.height1 = height1;
		this.health1 = health1;
	}

	public int getX() {
		return x1;
	}

	public void setX(int x1) {
		this.x1 = x1;
	}

	public int getY() {
		return y1;
	}

	public void setY(int y1) {
		this.y1 = y1;
	}

	public int getWidth() {
		return width1;
	}

	public void setWidth(int width1) {
		this.width1 = width1;
	}

	public int getHeight() {
		return height1;
	}

	public void setHeight(int height1) {
		this.height1 = height1;
	}

	public int getHealth() {
		return health1;
	}

	public void setHealth(int health1) {
		if (health1>=0 && health1<=100 ) {
			this.health1 = health1;

		}else {
			System.out.println("Greska je pri unosu ne smije biti izmedju 0 i 100 ");
		}
	}


		    
	}


