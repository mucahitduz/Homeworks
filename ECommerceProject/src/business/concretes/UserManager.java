package business.concretes;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
import business.abstracts.UserService;
import core.RegistrationService;
import dataAccess.concretes.MyUserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private MyUserDao myUserDao;
	private RegistrationService registrationService;

	
	public UserManager(MyUserDao myUserDao, RegistrationService registrationService) {
		this.myUserDao = myUserDao;
		this.registrationService = registrationService;

	}
	
	private static final String EMAIL_PATTERN =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern  pattern = Pattern.compile(EMAIL_PATTERN);
	
	public static boolean isValidEmail(final String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	@Override
	public void register(User user) {
		if(!isValidEmail(user.getEmail())) {
			System.out.println("L�tfen ge�erli bir mail adresi giriniz.");
			return;
		}
		if(user.getPassword().length()<6) {
			System.out.println("�ifre en az 6 karakterden olu�mal�d�r.");
			return;
		}
		if(user.getFirstName().length()<2) {
			System.out.println("Ad�n�z en az 2 karakterden olu�abilir.");
			return;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Soyad�n�z en az 2 karakterden olu�abilir.");
			return;
		}
		if(user.getFirstName() == null) {
			System.out.println("Ad alan� bo� b�rak�lamaz.");
			return;
		}
		if(user.getLastName() == null) {
			System.out.println("Soyad alan� bo� b�rak�lamaz.");
			return;
		}
		if(user.getEmail() == null) {
			System.out.println("Email alan� bo� b�rak�lamaz.");
			return;
		}
		if(user.getPassword() == null) {
			System.out.println("Parola alan� bo� b�rak�lamaz.");
			return;
		}
		if(myUserDao.email(user.getEmail())!=null) {
			System.out.println("Bu email adresi sistemde kay�tl�d�r.");
			return;
		}
		
		myUserDao.add(user);
	}

	@Override
	public void login(String email, String password) {
		registrationService.loginToSystem();
		
	}

}
