package Concrete;

import Abstract.UserCheckManager;
import Entities.User;

public class UserCheckServiceManager implements UserCheckManager{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
