package GAME;

public class VehicleFactory {
	  public static Vehicle createVehicle(VehicleType type) {
	        switch (type) {
	            case CAR:
	                return new Car();
	            case BIKE:
	                return new Bike();
	            case SCOOTER:
	                return new Scooter();
	            default:
	                throw new IllegalArgumentException("Unknown vehicle type: " + type);
	        }
	    }
}
