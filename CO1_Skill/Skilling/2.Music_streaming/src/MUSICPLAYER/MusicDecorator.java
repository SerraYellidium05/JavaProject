package MUSICPLAYER;

public abstract class MusicDecorator  extends MusicPlayer{
	protected MusicPlayer musicPlayer;

    public MusicDecorator(MusicPlayer musicPlayer) {
        super(musicPlayer.playback);
        this.musicPlayer = musicPlayer;
    }

}
