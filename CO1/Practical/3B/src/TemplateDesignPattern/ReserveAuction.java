package TemplateDesignPattern;

public class ReserveAuction extends AuctionProcessTemplate  {
	 private double reservePrice;
	public ReserveAuction(Auction auction, double reservePrice) {
		super(auction);
        this.reservePrice = reservePrice;
	}
	 protected void startBidding() {
	        System.out.println("Starting reserve auction with reserve price: " + reservePrice);
	        auction.startAuction();
	    }
	    protected void endBidding() {
	        System.out.println("Ending reserve auction bidding...");
	        auction.endAuction();
	    }
	    protected void announceWinner() {
	        System.out.println("Announcing the winner if the reserve price is met");
	    }
	    

}
