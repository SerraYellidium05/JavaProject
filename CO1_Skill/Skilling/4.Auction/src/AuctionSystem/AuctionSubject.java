package AuctionSystem;

public interface AuctionSubject {
	 void registerObserver(AuctionObserver observer);
	 void removeObserver(AuctionObserver observer);
	 void notifyObservers(String message);
}
