package com.github.divdiff.Carpentry_Project.carpentryApp.pojo;

public class Couch extends Furniture {

	private int length; // The length in feet
	private String couchType;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getCouchType() {
		return couchType;
	}
	public void setCouchType(String couchType) {
		this.couchType = couchType;
	}
}
