package TemplateDesignPattern;

public class Bidder implements Observer {
	private String name;
	public Bidder(String name) {
		this.name = name;
	}
	 public void update(String message) {
	        System.out.println("Bidder " + name + " received notification: " + message);
	    }
	    public String getName() {
	        return name;
	    }
}
