package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
	int id;
	String firstName;
	String LastName;
	int DateOfBirth;
	String nationalityId;
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
