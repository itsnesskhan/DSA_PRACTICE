package com.java.opps;

public class Address  implements Cloneable{

	private String city;
	private String state;
	private String courntry;
	
	
	public Address(String city, String state, String courntry) {
		super();
		this.city = city;
		this.state = state;
		this.courntry = courntry;
	}
	
	


	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public Address(Address address) {
		this(address.getCity(), address.getState(), address.getCourntry());
	}

	


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	

	public String getCourntry() {
		return courntry;
	}


	public void setCourntry(String courntry) {
		this.courntry = courntry;
	}




	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", courntry=" + courntry + "]";
	}


		
	
	
}

