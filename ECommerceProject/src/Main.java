import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import core.RegistrationManager;
import dataAccess.concretes.MyUserDao;
import entities.concretes.User;
import googleUserManager.GoogleUserManager;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Mücahit", "Düz", "mucahitduz@mucahit.com", "753951");
		User user2 = new User("Efecan", "Bayat", "efecan@gmail.com", "159357");
		
		UserService userService = new UserManager(new MyUserDao(), new RegistrationManager());
		
		EmailService emailService = new EmailManager();
		
		userService.register(user1);
		emailService.sendMail();
		emailService.verifyMail();
		
		System.out.println(" ");
		
		GoogleUserManager googleUserManager = new GoogleUserManager();
		
		userService.register(user2);
		googleUserManager.register();
		emailService.sendMail();
		emailService.verifyMail();
				
		
	}

}
