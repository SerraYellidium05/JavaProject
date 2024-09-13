package GAME;

public class RideSingleton {
	 private static RideSingleton instance;
	    private RideSingleton() {}
	    public static RideSingleton getInstance() {
	        if (instance == null) {
	            instance = new RideSingleton();
	        }
	        return instance;
	    }
	    public void requestRide(VehicleType vehicleType) {
	        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);
	        vehicle.ride();
	    }
}
