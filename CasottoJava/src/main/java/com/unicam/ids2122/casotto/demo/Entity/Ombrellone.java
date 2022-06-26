package com.unicam.ids2122.casotto.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="ombrelloni")
public class Ombrellone {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idOmbrellone;
	private float price;
	private String ombrelloneType;

	public Ombrellone(){}

	public Ombrellone(float price, String ombrelloneType) {
		this.price = price;
		this.ombrelloneType = ombrelloneType;
	}

	public long getIdOmbrellone() {
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
	public void setId(long idOmbrellone) {
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

	@Override
	public String toString() {
		return String.format("Ombrellone: [ fila: "+ ombrelloneType+","+"prezzo: "+ price+ "€ ]");
	}
}