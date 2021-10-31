package com.api.model;

import java.util.HashMap;


public class UserWeatherNewContribution {
	// Username variable for storing user's name.
	private String userName;
    // City variable for storing city's name.
	private String city;
	// Weather Details Map for storing the details city wise.
	private HashMap<String,Object> weatherDetails =new HashMap<>();
	public Weather(String city, HashMap<String, Object> weatherDetails) {
		super();
		this.city = city;
		this.weatherDetails = weatherDetails;
	}

	
}
