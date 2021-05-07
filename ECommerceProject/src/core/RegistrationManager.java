package core;

import googleUserManager.GoogleUserManager;

public class RegistrationManager implements RegistrationService {

	@Override
	public void registerToSystem() {
		
		GoogleUserManager googleUserManager = new GoogleUserManager();
		googleUserManager.register();
		
	}

	@Override
	public void loginToSystem() {
		// TODO Auto-generated method stub
		
	}

}
