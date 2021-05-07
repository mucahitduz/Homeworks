package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendMail() {
		System.out.println("Kay�t bilgileri ve do�rulama linki email adresinize g�nderildi. ");
		
	}

	@Override
	public void verifyMail() {
		System.out.println("Kay�t bilgileriniz do�ruland�. ");
		
	}

}
