package core;

public class GoogleRegistrationManager implements RegistrationService {

	@Override
	public void registerToSystem() {
		
		System.out.println("Google hesab�yla kay�t olundu. ");
		
	}

	@Override
	public void loginToSystem() {
		System.out.println("Google hesab�yla giri� yap�ld�.");
		
	}

}
