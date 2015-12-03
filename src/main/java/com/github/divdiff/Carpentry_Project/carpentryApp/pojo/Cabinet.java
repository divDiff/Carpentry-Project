package com.github.divdiff.Carpentry_Project.carpentryApp.pojo;

public class Cabinet extends Furniture {

	private int height; // measured in inches;
	private int numShelves;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getNumShelves() {
		return numShelves;
	}
	public void setNumShelves(int numShelves) {
		this.numShelves = numShelves;
	} 
}
