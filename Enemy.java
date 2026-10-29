package projekat;

public class Enemy extends GameObject {

	
	 protected String type;
	 protected int damage;
	 protected int health;
	    
 public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
	        super(x, y, width, height);
	        setType(type);
	        setDamage(damage);
	        setHealth(health);
	    }
	         
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        if (type == null || type.trim().isEmpty()) {
	            throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan.");
	        }
	        this.type = type.trim();
	    }

	    public int getDamage() {
	        return damage;
	    }

	    public void setDamage(int damage) {
	        if (damage < 0) {
	            throw new IllegalArgumentException("Damage ne može biti negativan.");
	        }
	        this.damage = damage;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        if (health < 0 || health > 100) {
	            throw new IllegalArgumentException("Health mora biti izmedju 0 i 100.");
	        }
	        this.health = health;
	    }

	    @Override
	    public String toString() {
	        return "Enemy[" + type + "] @ (" + x + "," + y + ") " + width + "x" + height + " DMG=" + damage + " HP=" + health;
	    }
	}
