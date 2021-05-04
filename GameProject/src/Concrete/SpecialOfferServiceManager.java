package Concrete;

import Abstract.SpecialOfferManager;
import Entities.SpecialOffer;

public class SpecialOfferServiceManager implements SpecialOfferManager{

	@Override
	public void add(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyas� eklendi");		
	}

	@Override
	public void remove(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyas� kald�r�ld�");
		
	}

	@Override
	public void update(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyas� g�ncellendi");
		
	}

}
