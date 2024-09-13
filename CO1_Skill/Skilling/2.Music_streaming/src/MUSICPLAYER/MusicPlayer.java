package MUSICPLAYER;

public abstract class MusicPlayer {
	protected PlaybackImplementation playback;

    public MusicPlayer(PlaybackImplementation playback) {
        this.playback = playback;
    }
    public abstract void play();
}
