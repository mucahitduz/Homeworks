package Concrete;

import Abstract.SalesManager;
import Entities.Game;
import Entities.Sale;
import Entities.SpecialOffer;
import Entities.User;

public class SalesServiceManager implements SalesManager{

	@Override
	public void add(Sale sale) {
		
		System.out.println(sale.getGameName() + " isimli oyun sipari� sepetine eklendi");
		
	}

	@Override
	public void purchase(User user, Game game, SpecialOffer specialOffer) {
		
		System.out.println(user.getFirstName() + "" + user.getLastName() + " " 
		+game.getNameOfGame() + " adl� oyunu " + specialOffer.getOfferName() + " kampanyas� kapsam�nda" + " %" +specialOffer.getDiscount() + " oran�nda indirimle " 
		+ specialOffer.getPriceAfterDiscount() + " liraya sat�n ald�");
		
		
		
	}

}
