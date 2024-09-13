package Game;

public class MediumItemFactory extends GameItemFactory {
	 public Weapon createWeapon() {
	 return new Weapon() {
	   public void use() {
	   System.out.println("Using an advanced weapon");
}
     };
   }
	 public PowerUp createPowerUp() {
	  return new PowerUp() {
	   public void activate() {
	    System.out.println("Activating an advanced power-up");
}
      };
	    }
}
