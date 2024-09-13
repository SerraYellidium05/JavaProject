package Game;

public class HardItemFactory extends GameItemFactory {
	 public Weapon createWeapon() {
	  return new Weapon() {
	  public void use() {
	  System.out.println("Using a powerful weapon");
 }
	};
   }
	 public PowerUp createPowerUp() {
	   return new PowerUp() {
	   public void activate() {
	   System.out.println("Activating a powerful power-up");
}
  };
 }

}
