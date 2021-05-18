package com.codeinger.flaxeninfotechtask.network.model;

import com.google.gson.annotations.SerializedName;

public class PlacesItem{

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("state")
	private String state;

	@SerializedName("state abbreviation")
	private String stateAbbreviation;

	@SerializedName("place name")
	private String placeName;

	@SerializedName("longitude")
	private String longitude;

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setStateAbbreviation(String stateAbbreviation){
		this.stateAbbreviation = stateAbbreviation;
	}

	public String getStateAbbreviation(){
		return stateAbbreviation;
	}

	public void setPlaceName(String placeName){
		this.placeName = placeName;
	}

	public String getPlaceName(){
		return placeName;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"PlacesItem{" + 
			"latitude = '" + latitude + '\'' + 
			",state = '" + state + '\'' + 
			",state abbreviation = '" + stateAbbreviation + '\'' + 
			",place name = '" + placeName + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}