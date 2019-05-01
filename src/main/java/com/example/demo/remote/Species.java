package com.example.demo.remote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Species {
	
	String id;
	String name;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getName(boolean toggle) {
		return toggle ? name.toUpperCase() : name.toLowerCase();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
