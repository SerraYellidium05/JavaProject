package MUSICPLAYER;

public class EqualizerDecorator extends MusicDecorator  {
	public EqualizerDecorator(MusicPlayer musicPlayer) {
        super(musicPlayer);
    }
    public void play() {
        musicPlayer.play();
        setEqualizer();
    }
    private void setEqualizer() {
        System.out.println("Setting equalizer.");
    }
}
