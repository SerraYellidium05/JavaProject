package GAME;

public class RideSharingApp {

	public static void main(String[] args) {
		 RideSingleton rideSharingApp = RideSingleton.getInstance();
	        rideSharingApp.requestRide(VehicleType.CAR);
	        rideSharingApp.requestRide(VehicleType.BIKE);
	        rideSharingApp.requestRide(VehicleType.SCOOTER);	

	}

}
