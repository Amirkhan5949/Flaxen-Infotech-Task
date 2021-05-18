package com.codeinger.flaxeninfotechtask.network.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsePinCode{

	@SerializedName("country")
	private String country;

	@SerializedName("places")
	private List<PlacesItem> places;

	@SerializedName("country abbreviation")
	private String countryAbbreviation;

	@SerializedName("post code")
	private String postCode;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPlaces(List<PlacesItem> places){
		this.places = places;
	}

	public List<PlacesItem> getPlaces(){
		return places;
	}

	public void setCountryAbbreviation(String countryAbbreviation){
		this.countryAbbreviation = countryAbbreviation;
	}

	public String getCountryAbbreviation(){
		return countryAbbreviation;
	}

	public void setPostCode(String postCode){
		this.postCode = postCode;
	}

	public String getPostCode(){
		return postCode;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePinCode{" + 
			"country = '" + country + '\'' + 
			",places = '" + places + '\'' + 
			",country abbreviation = '" + countryAbbreviation + '\'' + 
			",post code = '" + postCode + '\'' + 
			"}";
		}
}