package Concrete;

import Abstract.SpecialOfferManager;
import Entities.SpecialOffer;

public class SpecialOfferServiceManager implements SpecialOfferManager{

	@Override
	public void add(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyası eklendi");		
	}

	@Override
	public void remove(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyası kaldırıldı");
		
	}

	@Override
	public void update(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyası güncellendi");
		
	}

}
