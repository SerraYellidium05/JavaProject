package TemplateDesignPattern;

public class AuctionSystem {

	public static void main(String[] args) {
		Auction auction = new Auction("Antique Vase");
        Bidder bidder1 = new Bidder("John");
        Bidder bidder2 = new Bidder("Alice");
        auction.subscribe(bidder1);
        auction.subscribe(bidder2);
        AuctionProcessTemplate standardAuction = new StandardAuction(auction);
        standardAuction.runAuction();
        auction.unsubscribe(bidder2);
        AuctionProcessTemplate reserveAuction = new ReserveAuction(auction,500.00);
        reserveAuction.runAuction();
    }

}
