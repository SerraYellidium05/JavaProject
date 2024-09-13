package AuctionSystem;

public class ReserveAuction  extends AuctionTemplate {
	private double reservePrice;
	public ReserveAuction(AuctionEvent auctionEvent, double reservePrice) {
		super(auctionEvent);
        this.reservePrice = reservePrice;
			}
	protected void processBids() {
        System.out.println("Processing bids in a reserve auction with reserve price: " + reservePrice);
           }

}
