package GAME;

public class GameSingleton {
	 private static GameSingleton instance;
	    private GameLevel currentLevel;
	    private Difficulty difficulty;
	    private GameSingleton() {}
	    public static GameSingleton getInstance() {
	        if (instance == null) {
	            instance = new GameSingleton();
	        }
	        return instance;
	    }
	    public void startGame(Difficulty difficulty) {
	        this.difficulty = difficulty;
	        currentLevel = LevelFactory.createLevel(difficulty);
	        System.out.println("Game started with " + difficulty + " difficulty.");
	    }
	    public void nextLevel() {
	        currentLevel = LevelFactory.createLevel(difficulty);
	        System.out.println("Advancing to the next level with " + difficulty + " difficulty.");
	    }
	    public void play() {
	        currentLevel.play();
	    }
}



