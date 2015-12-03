package com.github.divdiff.Carpentry_Project.carpentryApp.pojo;

import java.util.Date;
import java.util.List;

public abstract class Furniture {

	private double price;
	private int buildTime; // Integer number of days
	private Date orderDate;
	private List<String> materials;
	private String itemName;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(int buildTime) {
		this.buildTime = buildTime;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<String> getMaterials() {
		return materials;
	}
	public void setMaterials(List<String> materials) {
		this.materials = materials;
	}
}
