import Adapter.MernisServiceAdapter;
import Concrete.GameServiceManager;
import Concrete.SalesServiceManager;
import Concrete.SpecialOfferServiceManager;
import Concrete.UserServiceManager;
import Entities.Game;
import Entities.SpecialOffer;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserServiceManager userServiceManager = new UserServiceManager(new MernisServiceAdapter());
		
		User user = new User(1, "Mücahit", " Düz", "37891748568", 1997, "bigdaddysunshine@gmail.com");
		
		userServiceManager.add(user);
		
		GameServiceManager gameServiceManager = new GameServiceManager();
		
		Game game = new Game(1, "World of Warcraft Shadowlands", 300);
		gameServiceManager.add(game);
		
		SpecialOfferServiceManager specialOfferServiceManager = new SpecialOfferServiceManager();
		SpecialOffer specialOffer = new SpecialOffer(1, "", 200, 30, "Bahar indirimleri", 50);
		specialOfferServiceManager.add(specialOffer);
		
		SalesServiceManager salesServiceManager = new SalesServiceManager();
		salesServiceManager.purchase(user, game, specialOffer);
		
	}

}
