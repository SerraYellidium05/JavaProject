package AuctionSystem;

public class Bidder {
	 private String name;
	public Bidder(String name) {
		this.name = name;
	}
	public void update(String auctionItem, String message) {
        System.out.println(name + " received update for " + auctionItem + ": " + message);
    }
	}
