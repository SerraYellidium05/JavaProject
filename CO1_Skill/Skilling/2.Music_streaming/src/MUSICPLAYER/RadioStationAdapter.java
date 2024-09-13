package MUSICPLAYER;

public abstract class RadioStationAdapter implements MediaSource {
	private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }
    public void play() {
        radioStation.playRadio();
    }

}
