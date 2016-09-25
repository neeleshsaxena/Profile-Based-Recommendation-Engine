package com.airbnb.dao;

import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

import com.airbnb.pojo.Listing;
import com.airbnb.pojo.User;

public class ReadDataDAO extends MongoConnectionDAO {
	public static String dbName = new String("airbnb");
	public static String packageName = "com.airbnb.pojo";

	public List<Listing> readAllListings() {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);
			// Query<Listings> query = datastore.createQuery(Listings.class);
			// List<Listings> listings = query.asList();

			List<Listing> listings = datastore.createQuery(Listing.class).asList();

			for (Listing oneList : listings) {
				System.out.println(oneList.getId());
			}

			return listings;
		} catch (Exception e) {
			System.out.println("Error Stack" + e.getMessage());

		}

		return null;

	}

	public List<User> readUserData() {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);
			List<User> users = datastore.createQuery(User.class).asList();

			for (User user : users) {
				System.out.println(user.getId());

			}

			return users;

		} catch (Exception e) {

			System.out.println("Error in fetching user data " + e.getMessage());

		}

		return null;

	}

	public List<Listing> userListings(String userId, String password) throws ParseException {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);

			Query<Listing> query = datastore.createQuery(Listing.class).disableValidation();
			query.field("id").equalIgnoreCase(userId);
			query.field("password").equalIgnoreCase(password);
			List<Listing> allListings = query.asList();
			return allListings;
		} catch (Exception e) {
			System.out.println("Error in fetching specific listings " + e.getMessage());
		}
		return null;
	}
	
	public List<Listing> userkiList() throws ParseException {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);

			Query<Listing> query = datastore.createQuery(Listing.class).disableValidation();
			query.field("id").equalIgnoreCase("109");
			//query.field("password").equalIgnoreCase(password);
			List<Listing> allListings = query.asList();
			return allListings;
		} catch (Exception e) {
			System.out.println("Error in fetching specific listings " + e.getMessage());
		}
		return null;
	}
	
	public User userLogin(String userID) throws ParseException {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);
			
			//String a = userID.valueOf(userID.indexOf(0));
			//String b = password.valueOf(userID.indexOf(0));
			
			//String c = Character.toString(a.charAt(1));
			//List<User> users = datastore.createQuery(User.class).asList();

			/*for (User oneuser : users) {
				System.out.println(oneuser.getId());
			}*/
			
			Query<User> query = datastore.createQuery(User.class).disableValidation();
			query.field("id").equal(Integer.parseInt(userID));
			//query.field("id").equal(c.toString());
			User user = query.get();
			//System.out.println("sds");
			System.out.println("the user name is " + user.getFirstName());
			return user;
		} catch (Exception e) {
			System.out.println("Error in login dao " + e.getMessage());
		}
		return null;
	}
	
	public List<Listing> userListings(String userID) throws ParseException {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);
			
			//String a = userID.valueOf(userID.indexOf(0));
			//String b = password.valueOf(userID.indexOf(0));
			
			//String c = Character.toString(a.charAt(1));
			//List<User> users = datastore.createQuery(User.class).asList();

			/*for (User oneuser : users) {
				System.out.println(oneuser.getId());
			}*/
			
			Query<User> query = datastore.createQuery(User.class).disableValidation();
			query.field("id").equal(Integer.parseInt(userID));
			//query.field("id").equal(c.toString());
			User user = query.get();
			//System.out.println("sds");
			System.out.println("the user name is " + user.getFirstName());
			
			//get the listings object
			List<String> listings = user.getUsersListings();
			String temp = listings.get(0);
			String [] parts = temp.split(",");
			
			List<Listing> li = new ArrayList<Listing>();
			
			//listing ids 
			for(int i=0;i<parts.length;i++){
				
				Query<Listing> query1 = datastore.createQuery(Listing.class).disableValidation();
				query1.field("id").equalIgnoreCase(parts[i].trim());
				//query.field("password").equalIgnoreCase(password);
				Listing list = query1.get();
				
				li.add(list);
				
			//System.out.println(parts[i].trim());  //
			}
		
			
		
			
			return li;
			
			//System.out.println("asas");
			//return user;
		} catch (Exception e) {
			System.out.println("Error in login dao " + e.getMessage());
		}
		return null;
	}
	
	public Listing getListing(String id) throws ParseException {

		try {
			Datastore datastore = datastoreConn(dbName, packageName);

			Query<Listing> query = datastore.createQuery(Listing.class).disableValidation();
			query.field("id").equalIgnoreCase(id);
			//query.field("password").equalIgnoreCase(password);
			Listing list = query.get();
			return list;
		} catch (Exception e) {
			System.out.println("Error in fetching specific listings " + e.getMessage());
		}
		return null;
	}
	
	
}
