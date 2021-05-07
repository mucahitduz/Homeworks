package business.abstracts;

import entities.concretes.User;

public interface VerificationService {
	
	void verifyFirstName(User user);
	
	void verifyLastName(User user);
	
	void verifyEmail(User user);
	
	void verifyPassword(User user);
	
}
