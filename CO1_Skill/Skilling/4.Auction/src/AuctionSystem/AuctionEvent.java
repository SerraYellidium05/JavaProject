package AuctionSystem;

import java.util.ArrayList;
import java.util.List;
public abstract class AuctionEvent implements AuctionSubject {
	  private List<AuctionObserver> observers;
	    private String auctionItem;

	public AuctionEvent(String auctionItem) {
		 this.auctionItem = auctionItem;
	      this.observers = new ArrayList<>();
			}
	public void registerObserver(AuctionObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(AuctionObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message,String Item) {
        for (AuctionObserver observer : observers) {
            observer.update(auctionItem, message);
                    }
    }
    public void startAuction() {
        notifyObservers("Auction started for item: " + auctionItem);
    }
    public void endAuction() {
        notifyObservers("Auction ended for item: " + auctionItem);
    }

}
