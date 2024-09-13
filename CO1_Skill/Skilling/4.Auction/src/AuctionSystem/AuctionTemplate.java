package AuctionSystem;

public abstract class AuctionTemplate {
	protected AuctionEvent auctionEvent;
	public AuctionTemplate(AuctionEvent auctionEvent) {
		 this.auctionEvent = auctionEvent;
	}
	public final void conductAuction() {
        startAuction();
        processBids();
        endAuction();
    }

    protected void startAuction() {
        auctionEvent.startAuction();
    }

    protected abstract void processBids();

    protected void endAuction() {
        auctionEvent.endAuction();
    }

}
