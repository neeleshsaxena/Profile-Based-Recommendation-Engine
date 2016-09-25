package com.airbnb.dao;

import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoConnectionDAO {
	
	//mongo driver utha
	public static MongoClient mongo;

	public static MongoClient connection() {

		try {
			if (mongo == null) {
				mongo = new MongoClient("localhost", 27017);
			}
			System.out.println("Connection Success");
		} catch (UnknownHostException e) {
			System.out.println("Not able to make mongo connection");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mongo;
	}

	public static Datastore datastoreConn(String dbName, String packageName) {
		MongoClient mongoClient = connection();
		Morphia morphia = new Morphia();
		morphia.mapPackage(packageName);
		Datastore datastore = morphia.createDatastore(mongoClient, dbName);
		return datastore;
	}

}
