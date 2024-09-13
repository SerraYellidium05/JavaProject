package Music;
public class Main1 {

	public static void main(String[] args) {
		LocalFile localFile = new LocalFile();
        OnlineStreamingService onlineService = new OnlineStreamingService();
        RadioStation radioStation = new RadioStation();
        OnlineStreamingAdapter onlineStreamingAdapter = new OnlineStreamingAdapter(onlineService);
        RadioStationAdapter radioStationAdapter = new RadioStationAdapter(radioStation);
        StandardPlayback standardPlayback = new StandardPlayback();
        AdvancedMusicPlayer localPlayer = new AdvancedMusicPlayer(standardPlayback);
        VolumeControlDecorator volumeControlledPlayer = new VolumeControlDecorator(localPlayer);
        System.out.println("Playing local file:");
        volumeControlledPlayer.play();
        System.out.println("\nPlaying online streaming service:");
        onlineStreamingAdapter.play();
        System.out.println("\nPlaying radio station:");
        radioStationAdapter.play();
	}

}
