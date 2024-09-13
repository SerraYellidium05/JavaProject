package MUSICPLAYER;

public class VolumeControlDecorator extends MusicDecorator {

	public VolumeControlDecorator(MusicPlayer musicPlayer) {
		super(musicPlayer);
		
	}
    public void play() {
        musicPlayer.play();
        setVolume();
    }
    private void setVolume() {
        System.out.println("Setting volume.");
    }
}
