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
		System.out.println(user.getFirstName() + "" +user.getLastName() + " isimli m��teri kaydoldu");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "" +user.getLastName() + "isimli m��terinin kayd� silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "" +user.getLastName() + "isimli m��teri g�ncellendi");
		
	}

}
