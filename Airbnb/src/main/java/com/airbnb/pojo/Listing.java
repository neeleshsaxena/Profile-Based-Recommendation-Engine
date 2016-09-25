package com.airbnb.pojo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("listings")
public class Listing {

	@Id
	private ObjectId id;

	@Property("id")
	private String listingID;

	@Property("description")
	private String description;
	
	@Property("thumbnail_url")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Property("host_location")
	private String hostLocation;

	@Property("host_acceptance_rate")
	private String hostAcceptanceRate;

	@Property("host_identity_verified")
	private String hostIdentityVerified;

	@Property("host_picture_url")
	private String pictureUrl;

	@Property("smart_location")
	private String smartLocation;

	@Property("latitude")
	private String latitude;

	@Property("longitude")
	private String longitude;

	@Property("accommodates")
	private String accommodates;

	

	@Property("review_scores_value")
	private String reviewScoresValue;

	@Property("host_is_superhost")
	private String hostIsSuperhost;

	@Property("host_response_rate")
	private String hostResponseRate;

	@Property("instant_bookable")
	private String instantBookable;

	@Property("neighbourhood_cleansed")
	private String neighbourhoodCleansed;

	@Property("price")
	private String price;

	@Property("review_scores_rating")
	private String reviewScoresRating;



	@Property("host_response_time")
	private String hostResponseTime;

	@Property("property_type")
	private String propertyType;

	@Property("room_type")
	private String roomType;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}



	public String getAccommodates() {
		return accommodates;
	}

	public void setAccommodates(String accommodates) {
		this.accommodates = accommodates;
	}

	public String getReviewScoresValue() {
		return reviewScoresValue;
	}

	public void setReviewScoresValue(String reviewScoresValue) {
		this.reviewScoresValue = reviewScoresValue;
	}

	public String getReviewScoresRating() {
		return reviewScoresRating;
	}

	public void setReviewScoresRating(String reviewScoresRating) {
		this.reviewScoresRating = reviewScoresRating;
	}



	public String getListingID() {
		return listingID;
	}

	public void setListingID(String listingID) {
		this.listingID = listingID;
	}

	public String getHostAcceptanceRate() {
		return hostAcceptanceRate;
	}

	public void setHostAcceptanceRate(String hostAcceptanceRate) {
		this.hostAcceptanceRate = hostAcceptanceRate;
	}

	public String getHostIdentityVerified() {
		return hostIdentityVerified;
	}

	public void setHostIdentityVerified(String hostIdentityVerified) {
		this.hostIdentityVerified = hostIdentityVerified;
	}

	

	public String getHostIsSuperhost() {
		return hostIsSuperhost;
	}

	public void setHostIsSuperhost(String hostIsSuperhost) {
		this.hostIsSuperhost = hostIsSuperhost;
	}

	public String getHostResponseRate() {
		return hostResponseRate;
	}

	public void setHostResponseRate(String hostResponseRate) {
		this.hostResponseRate = hostResponseRate;
	}

	public String getInstantBookable() {
		return instantBookable;
	}

	public void setInstantBookable(String instantBookable) {
		this.instantBookable = instantBookable;
	}

	public String getNeighbourhoodCleansed() {
		return neighbourhoodCleansed;
	}

	public void setNeighbourhoodCleansed(String neighbourhoodCleansed) {
		this.neighbourhoodCleansed = neighbourhoodCleansed;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHostLocation() {
		return hostLocation;
	}

	public void setHostLocation(String hostLocation) {
		this.hostLocation = hostLocation;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getSmartLocation() {
		return smartLocation;
	}

	public void setSmartLocation(String smartLocation) {
		this.smartLocation = smartLocation;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	

	
	public String getHostResponseTime() {
		return hostResponseTime;
	}

	public void setHostResponseTime(String hostResponseTime) {
		this.hostResponseTime = hostResponseTime;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		String reviewScore = String.valueOf(this.getReviewScoresValue());
		return reviewScore;
	}

}
