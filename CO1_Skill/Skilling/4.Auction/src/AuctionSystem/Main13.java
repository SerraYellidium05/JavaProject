package AuctionSystem;

public class Main13 {

	public static void main(String[] args) {
		AuctionEvent auctionEvent = new AuctionEvent("Antique Vase");
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        auctionEvent.registerObserver((AuctionObserver) bidder1);
        auctionEvent.registerObserver((AuctionObserver) bidder2);
        AuctionTemplate standardAuction = new StandardAuction(auctionEvent);
        standardAuction.conductAuction();
        AuctionTemplate reserveAuction = new ReserveAuction(auctionEvent, 100.0);
        reserveAuction.conductAuction();
        auctionEvent.removeObserver((AuctionObserver) bidder1);
        auctionEvent.removeObserver((AuctionObserver) bidder2);
    }

	}

