package MUSICPLAYER;

public abstract class LocalFileAdapter  implements MediaSource{
	private LocalFile localFile;

    public LocalFileAdapter(LocalFile localFile) {
        this.localFile = localFile;
    }
    public void play() {
        localFile.playFile();
    }

}
