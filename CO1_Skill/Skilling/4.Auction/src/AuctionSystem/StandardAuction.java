package AuctionSystem;

public class StandardAuction extends AuctionTemplate {

	public StandardAuction(AuctionEvent auctionEvent) {
		super(auctionEvent);
	}
	protected void processBids() {
        System.out.println("Processing bids in a standard auction...");
          }
}
