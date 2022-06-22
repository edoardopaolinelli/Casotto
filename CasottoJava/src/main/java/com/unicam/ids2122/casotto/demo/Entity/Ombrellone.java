package com.unicam.ids2122.casotto.demo.Entity;

public class Ombrellone {

	private String idOmbrellone;
	private float price;
	private String ombrelloneType;

	public Ombrellone(){}

	public Ombrellone(String idOmbrellone, float price, String ombrelloneType) {
		this.idOmbrellone = idOmbrellone;
		this.price = price;
		this.ombrelloneType = ombrelloneType;
	}

	public String getIdOmbrellone() {
		return this.idOmbrellone;
	}

	public float getPrice() {
		return this.price;
	}

	public String getType() {
		return this.ombrelloneType;
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public void setId(String idOmbrellone) {
		this.idOmbrellone = idOmbrellone;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 
	 * @param ombrelloneType
	 */
	public void setType(String ombrelloneType) {
		this.ombrelloneType = ombrelloneType;
	}

}