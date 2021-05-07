package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class MyUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();


	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " +user.getFirstName() + " " +user.getLastName() + ". " +user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " +user.getFirstName() + " " +user.getLastName() + ". " +user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi: " +user.getFirstName() + " " +user.getLastName() + ". " +user.getEmail());
		
	}

	@Override
	public User email(String email) {
		for(User user : users) {
			if(user.getEmail().equals(email))
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

}
