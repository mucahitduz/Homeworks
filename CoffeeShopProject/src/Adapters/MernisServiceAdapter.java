package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
		try {
			mernisValidation.TCKimlikNoDogrula(Long.parseLong("37891748568"),"Mücahit", "Düz", 1997);
		} catch (Exception e) {
			
		}
		try {
			if(mernisValidation.TCKimlikNoDogrula(Long.parseLong("37891748568"),
			  customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth()))
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
