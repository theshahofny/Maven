package org.ssa.ironyard.web;

public class Property {
	
	int cost;
	String address;
	//square feet
	int floorArea;
	
	
	public Property(int cost, String address, int floorArea) {
		this.cost = cost;
		this.address = address;
		this.floorArea = floorArea;
	}



	public int getCost() {
		return cost;
	}




	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}




	public int getFloorArea() {
		return floorArea;
	}




	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}



	
}
