package MUSICPLAYER;

public class AdvancedMusicPlayer  extends MusicPlayer{
	 public AdvancedMusicPlayer(PlaybackImplementation playback) {
	        super(playback);
	    }
	    public void play() {
	        playback.play();
	    }

}
