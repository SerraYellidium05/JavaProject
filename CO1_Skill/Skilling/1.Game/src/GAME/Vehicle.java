package GAME;

public interface Vehicle {
	void ride();
}
class Car implements Vehicle{  
    public void ride() {
        System.out.println("Riding a car.");
    }
}
class Bike implements Vehicle {
     public void ride() {
        System.out.println("Riding a bike.");
    }
}
class Scooter implements Vehicle {

    public void ride() {
        System.out.println("Riding a scooter.");
    }
}
