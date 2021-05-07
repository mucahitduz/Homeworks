package core;

public class GoogleRegistrationManager implements RegistrationService {

	@Override
	public void registerToSystem() {
		
		System.out.println("Google hesabýyla kayýt olundu. ");
		
	}

	@Override
	public void loginToSystem() {
		System.out.println("Google hesabýyla giriþ yapýldý.");
		
	}

}
