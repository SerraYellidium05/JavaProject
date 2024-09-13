package Bike;

public abstract class VehicleFactory {
	 public abstract Vehicle createVehicle();

	    public static VehicleFactory getFactory(String type) {
	        switch (type.toLowerCase()) {
	            case "car":
	                return new CarFactory();
	            case "bike":
	                return new BikeFactory();
	            case "scooter":
	                return new ScooterFactory();
	            default:
	             System.out.println("Unknown vehicle type");
	        }
			return null;
	    }

		protected abstract Vehicle getVehicle();
	}
	abstract class CarFactory extends VehicleFactory {
	    public Vehicle createVehicle() {
	        return new Car();
	    }
	}
	abstract class BikeFactory extends VehicleFactory {
	    public Vehicle createVehicle() {
	        return new Bike();
	    }
 }
	abstract class ScooterFactory extends VehicleFactory {
	    public Vehicle createVehicle() {
	        return null;
	    }
	}