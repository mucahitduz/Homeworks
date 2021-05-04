package Entities;

public class SpecialOffer extends Game{
	
	String offerName;
	int discount;
	int priceAfterDiscount;
	
	public SpecialOffer(int id, String nameOfGame, int priceOfGame, int discount, String offerName, int priceAfterDiscount) {
		super(id, nameOfGame, priceOfGame);
		this.discount = discount;
		this.priceAfterDiscount = priceAfterDiscount;
		this.offerName = offerName;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPriceAfterDiscount() {
		return this.priceOfGame - (this.priceOfGame * this.discount / 100);
	}
	
}
