package projekat;

public class GameObject {


	    protected int x;
	    protected int y;
	    protected int width;
	    protected int height;

	    // Konstruktor 
	    public GameObject(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        setWidth(width);   
	        setHeight(height); 
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public void setWidth(int width) {
	        if (width > 0) {
	            this.width = width;
	        } else {
	            this.width = 1;     
	        }
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        if (height > 0) {
	            this.height = height;
	        } else {
	            this.height = 1;
	        }
	    }

	    public boolean intersects(GameObject other) {
	        if (other == null) return false;
	        return this.x < other.x + other.width &&
	               this.x + this.width > other.x &&
	               this.y < other.y + other.height &&
	               this.y + this.height > other.y;
	    }

	    @Override
	    public String toString() {
	        return "GameObject @ (" + x + "," + y + ") " + width + "x" + height;
	    }
	}
