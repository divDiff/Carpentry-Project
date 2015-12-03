package com.github.divdiff.Carpentry_Project.carpentryApp.pojo;

public class Table extends Furniture {
	
	private int height; // measured in inches
	private String tableType;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
}
