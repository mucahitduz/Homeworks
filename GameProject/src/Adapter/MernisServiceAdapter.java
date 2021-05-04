package Adapter;

import Abstract.UserCheckManager;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckManager{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		KPSPublicSoap userValidation = new KPSPublicSoapProxy();
		
		try {
			userValidation.TCKimlikNoDogrula(Long.parseLong("37891748568"),"Mücahit", "Düz", 1997);
		} catch (Exception e) {
			
		}
		try {
			if(userValidation.TCKimlikNoDogrula(Long.parseLong("37891748568"),
			  user.getFirstName(), user.getLastName(), user.getDateOfBirth()))
			{
				  return true;
			  }else {
				  return false;
			  }
		} catch (Exception e) {
			return false;
		}
	}

}
