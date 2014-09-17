package com.flyingh.mybatis.vo;

public class Address {
	private int addrId;
	private String city;
	private String zip;

	public Address() {
	}

	public Address(String city, String zip) {
		this.city = city;
		this.zip = zip;
	}

	public Address(int addrId, String city, String zip) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.zip = zip;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", zip=" + zip + "]";
	}
}
