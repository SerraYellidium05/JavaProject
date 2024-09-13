package GAME;

public abstract class GameLevel {
	  public abstract void play();
}
class EasyLevel extends GameLevel {
    public void play() {
        System.out.println("Playing on Easy Level.");
    }
}

class MediumLevel extends GameLevel {
    public void play() {
        System.out.println("Playing on Medium Level.");
    }
}

class HardLevel extends GameLevel {
    public void play() {
        System.out.println("Playing on Hard Level.");

    }
}
