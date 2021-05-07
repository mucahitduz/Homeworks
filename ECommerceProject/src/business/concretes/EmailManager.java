package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendMail() {
		System.out.println("Kayýt bilgileri ve doðrulama linki email adresinize gönderildi. ");
		
	}

	@Override
	public void verifyMail() {
		System.out.println("Kayýt bilgileriniz doðrulandý. ");
		
	}

}
