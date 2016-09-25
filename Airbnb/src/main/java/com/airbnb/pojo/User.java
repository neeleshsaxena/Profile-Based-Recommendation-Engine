package com.airbnb.pojo;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("users")
public class User {

	@Id
	private ObjectId id;

	@Property("id")
	private String userID;

	@Property("gender")
	private String gender;
	
	@Property("first_name")
	private String firstName;

	@Property("last_name")
	private String lastName;
	
	@Property("password")
	private String password;
	
	@Embedded("listing_ids")
	private List<String> usersListings;
	  
	  
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getUsersListings() {
		return usersListings;
	}

	public void setUsersListings(List<String> usersListings) {
		this.usersListings = usersListings;
	}

	@Property("age_group")
	private String ageGroup;

	@Property("profession")
	private String profession;

	@Property("hobbies")
	private String hobbies;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	
}
