package TemplateDesignPattern;

public abstract class AuctionProcessTemplate {
	 protected Auction auction;
	public AuctionProcessTemplate(Auction auction) {
		 this.auction = auction;
	}
	public final void runAuction() {
        prepareAuction();
        startBidding();
        endBidding();
        announceWinner();
    }
    protected void prepareAuction() {
        System.out.println("Preparing auction for item: " + auction);
    }
    protected abstract void startBidding();
    protected abstract void endBidding();
    protected void announceWinner() {
        System.out.println("Announcing the winner...");
    }
}
