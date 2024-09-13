package Game;

public class EasyItemFactory extends GameItemFactory {
	public Weapon createWeapon() {
		return new Weapon() {
			public void use() {
				System.out.println("Using a simple weapon");
			}
		};
	}
	public PowerUp createPowerUp() {
		return new PowerUp() {
            public void activate() {
                System.out.println("Activating a basic power-up");
            }
        };
	}

}
