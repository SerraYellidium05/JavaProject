package Game;

public class Game1 {

	public static void main(String[] args) {
		 GameState gameState = GameState.getInstance();
	        gameState.setDifficulty("Medium");
	        Enemy enemy = EnemyFactory.createEnemy(gameState.getDifficulty());
	        if (enemy != null) {
	            enemy.attack();
	        } else {
	            System.out.println("Failed to create enemy.");
	            return;  
	        }
	        GameItemFactory itemFactory;
	        switch (gameState.getDifficulty()) {
	            case "Easy":
	                itemFactory = new EasyItemFactory();
	                break;
	            case "Medium":
	                itemFactory = new MediumItemFactory();
	                break;
	            case "Hard":
	                itemFactory = new HardItemFactory();
	                break;
	            default:
	                System.out.println("Unknown difficulty: " + gameState.getDifficulty());
	                return;
	        }
	        if (itemFactory != null) {
	            Weapon weapon = itemFactory.createWeapon();
	            if (weapon != null) {
	                weapon.use();
	            } else {
	                System.out.println("Failed to create weapon.");
	            }
	            PowerUp powerUp = itemFactory.createPowerUp();
	            if (powerUp != null) {
	                powerUp.activate();
	            } else {
	                System.out.println("Failed to create power-up.");
	            }
	        }
	        gameState.nextLevel();
	        gameState.increaseScore(100);
	    }
}
