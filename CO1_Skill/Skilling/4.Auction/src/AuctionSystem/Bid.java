package AuctionSystem;

public class Bid {
	 private double amount;
	    private String bidderName;

	public Bid(double amount, String bidderName) {
		this.amount = amount;
        this.bidderName = bidderName;
			}
	public double getAmount() {
        return amount;
    }

    public String getBidderName() {
        return bidderName;
    }
}
