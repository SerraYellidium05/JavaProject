package GAME;

public class Game {

	public static void main(String[] args) {
		GameSingleton game = GameSingleton.getInstance();
        game.startGame(Difficulty.MEDIUM);
        game.play();
        game.nextLevel();
        game.play();
	}

}
