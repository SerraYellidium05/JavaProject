package GAME;

public class LevelFactory {
	 public static GameLevel createLevel(Difficulty difficulty) {
	        switch (difficulty) {
	            case EASY:
	                return new EasyLevel();
	            case MEDIUM:
	                return new MediumLevel();
	            case HARD:
	                return new HardLevel();
	            default:
	               System.out.println("Unknown difficulty: " + difficulty);
	        }
			return null;
	    }
}

