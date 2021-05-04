package Entities;

public class Sale {
	String customerName;
	String gameName;
	String specialOfferName;
	int price;
	
	public Sale(String customerName, String gameName, String specialOfferName, int price) {
		super();
		this.customerName = customerName;
		this.gameName = gameName;
		this.specialOfferName = specialOfferName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getSpecialOfferName() {
		return specialOfferName;
	}

	public void setSpecialOfferName(String specialOfferName) {
		this.specialOfferName = specialOfferName;
	}

	public int getPrice() {
		return price;
	}
}
