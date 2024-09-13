package TemplateDesignPattern;

public class StandardAuction extends AuctionProcessTemplate{
	public StandardAuction(Auction auction) {
		  super(auction);
	}
	protected void startBidding() {
        System.out.println("Starting standard auction bidding...");
        auction.startAuction();
    }
    protected void endBidding() {
        System.out.println("Ending standard auction bidding...");
        auction.endAuction();
    }
}
