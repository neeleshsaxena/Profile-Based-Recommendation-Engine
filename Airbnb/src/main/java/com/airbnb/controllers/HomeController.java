package com.airbnb.controllers;

import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airbnb.dao.ReadDataDAO;
import com.airbnb.pojo.Listing;
import com.airbnb.pojo.User;
import com.google.gson.JsonArray;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	ReadDataDAO readDao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws UnknownHostException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws UnknownHostException {
		try{
		logger.info("Welcome home!");
		
		//System.out.println("read all listings");
		
		//List<User> users = readDao.readUserData();
		//List<Listing> listings = readDao.readAllListings();
		
		//List<Listing> listing1 = readDao.userkiList();
		
		System.out.println("Woho");
		}
		catch(Exception e){
			System.out.println("Error Stack "+ e.getMessage());
		}
		
		
		return "login";
	}
	
	//check if username password exists
		@RequestMapping(value="/index", method = RequestMethod.POST)
		public String loginCheck(@RequestParam ("userID") String userId,HttpServletRequest request)throws Exception
		{
			
		try{
			
			HttpSession session = request.getSession();
			
			//List<Listing> listing1 = readDao.userkiList();
			
				//List<User> u = readDao.userkiList();
				//display his club, his rides,recommendations for products and rides,notifications
				User user = readDao.userLogin(userId);
				
				//fetch user's listings
				List<Listing> listings = readDao.userListings(user.getUserID());
				
				
				session.setAttribute("user", user);
				session.setAttribute("listings", listings);
				
				System.out.println("User login successful, saved the user and his listings in session");
				
				return "home";
				
				
				
				
			
			
			
		}
		catch(Exception e){
			
			System.out.println("Exception:"+e.getMessage());
		}
			//else return to the login page
			return "home";
		}
		
		
		//ajax call to set notification count
		@RequestMapping(value="/readLocations", method = RequestMethod.GET)
		public @ResponseBody List<Listing> read(HttpServletRequest request){

			try{
	
				
	
				HttpSession session = request.getSession();

				User user = (User)session.getAttribute("user");
				
				//get listings result for the user
				
				List<Listing> listings = readDao.userListings(user.getUserID());
				//List<Message> messages = messageDao.getNotification(member);
				
				//JSONArray listingJson = new JSONArray(listings);

				return listings; 
	

			}
			catch(Exception e){
				System.out.println("Error:" +e.getMessage() );
				return null;
			}

		}
		
}
