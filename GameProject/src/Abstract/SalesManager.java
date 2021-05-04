package Abstract;

import Entities.Game;
import Entities.Sale;
import Entities.SpecialOffer;
import Entities.User;

public interface SalesManager {
	void add(Sale sale);
	
	void purchase(User user, Game game, SpecialOffer specialOffer);
}
