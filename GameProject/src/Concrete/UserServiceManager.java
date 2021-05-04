package Concrete;

import Abstract.UserService;
import Adapter.MernisServiceAdapter;
import Entities.User;

public class UserServiceManager implements UserService{

	public UserServiceManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "" +user.getLastName() + " isimli müþteri kaydoldu");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "" +user.getLastName() + "isimli müþterinin kaydý silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "" +user.getLastName() + "isimli müþteri güncellendi");
		
	}

}
