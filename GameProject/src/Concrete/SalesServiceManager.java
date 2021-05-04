package Concrete;

import Abstract.SalesManager;
import Entities.Game;
import Entities.Sale;
import Entities.SpecialOffer;
import Entities.User;

public class SalesServiceManager implements SalesManager{

	@Override
	public void add(Sale sale) {
		
		System.out.println(sale.getGameName() + " isimli oyun sipariþ sepetine eklendi");
		
	}

	@Override
	public void purchase(User user, Game game, SpecialOffer specialOffer) {
		
		System.out.println(user.getFirstName() + "" + user.getLastName() + " " 
		+game.getNameOfGame() + " adlý oyunu " + specialOffer.getOfferName() + " kampanyasý kapsamýnda" + " %" +specialOffer.getDiscount() + " oranýnda indirimle " 
		+ specialOffer.getPriceAfterDiscount() + " liraya satýn aldý");
		
		
		
	}

}
