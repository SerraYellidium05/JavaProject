package TemplateDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
	 private List<Observer> bidders;
	    private String itemName;
	public Auction(String itemName) {
		this.itemName = itemName;
        this.bidders = new ArrayList<>();
	}
	public void subscribe(Observer observer) {
        bidders.add(observer);
        System.out.println("Bidder subscribed: " + ((Bidder) observer).getName());
    }
    public void unsubscribe(Observer observer) {
        bidders.remove(observer);
        System.out.println("Bidder unsubscribed: " + ((Bidder) observer).getName());
    }
    public void notifyObservers(String message) {
        for (Observer bidder : bidders) {
            bidder.update(message);
        }
    }
    public void startAuction() {
        notifyObservers("Auction started for item: " + itemName);
    }
    public void endAuction() {
        notifyObservers("Auction ended for item: " + itemName);
    }

}
