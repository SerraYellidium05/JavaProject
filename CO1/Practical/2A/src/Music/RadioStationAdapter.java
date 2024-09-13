package Music;

public class RadioStationAdapter implements MediaSource {
	private RadioStation radioStation;
    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }
    public void play() {
        radioStation.playRadio();
    }

}
