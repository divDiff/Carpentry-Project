package com.github.divdiff.Carpentry_Project.carpentryApp.pojo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order extends Furniture {
	
	private List<Furniture> items;
	private Date orderDate;
	private Date startDate;
	private Date completionDate;
	
	public List<Furniture> getItems() {
		return items;
	}
	public void setItems(List<Furniture> items) {
		this.items = items;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	
	public double getTotalCost() {
		double totalCost = 0.0;
		for(Furniture f : items) {
			totalCost += f.getPrice();
		}
		return totalCost;
	}
	
	public Map<String,Double> getItemizedCost() {
		Map<String,Double> itemizedCost = new HashMap<String,Double>();
		for(Furniture f : items) {
			itemizedCost.put(f.getItemName(), new Double(f.getPrice()));
		}
		return itemizedCost;
	}
	
}
