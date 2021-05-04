package Concrete;

import Abstract.SpecialOfferManager;
import Entities.SpecialOffer;

public class SpecialOfferServiceManager implements SpecialOfferManager{

	@Override
	public void add(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyasý eklendi");		
	}

	@Override
	public void remove(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyasý kaldýrýldý");
		
	}

	@Override
	public void update(SpecialOffer specialOffer) {
		System.out.println(specialOffer.getOfferName() + " kampanyasý güncellendi");
		
	}

}
