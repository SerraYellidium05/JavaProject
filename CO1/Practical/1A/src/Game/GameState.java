package Game;

public class GameState {
 private static GameState instance;
 private int level;
 private String difficulty;
 private int score;
	private GameState() {
		level = 1;
		difficulty = "Easy";
		score = 0;
	}
	public static GameState getInstance() {
		if(instance == null) {
			instance = new GameState();
		}
		return instance;
	}
	public void nextLevel() {
		level++;
		System.out.println("Level up! Current level: " +level);
	}
	  public void increaseScore(int points) {
	        score += points;
	        System.out.println("Score: " + score);
	    }

	    public int getLevel() {
	        return level;
	    }

	    public String getDifficulty() {
	        return difficulty;
	    }
	public void setDifficulty(String difficulty){
		this.difficulty = difficulty;
	}
	public int  getScore() {
	return score;    
	}	
}
