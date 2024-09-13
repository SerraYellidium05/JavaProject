package Game;

public class EnemyFactory {
	public EnemyFactory() {
    }
    public static Enemy createEnemy(String difficulty) {
        if ("Easy".equalsIgnoreCase(difficulty)) {
            return new EasyEnemy();
        } else if ("Medium".equalsIgnoreCase(difficulty)) {
            return new MediumEnemy();
        } else if ("Hard".equalsIgnoreCase(difficulty)) {
            return new HardEnemy();
        } else {
            System.out.println("Unknown difficulty:"+ difficulty + ",returning a default enemy");
            return null;
}
    }
}
