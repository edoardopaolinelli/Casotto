package com.unicam.ids2122.casotto.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="lettini")
public class Lettino {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idLettino;
	private float price;

	private String lettinoType;

	public long getIdLettino() {
		return this.idLettino;
	}

	public float getPrice() {
		return this.price;
	}

	public String getType() {
		return this.lettinoType;
	}

	public Lettino(){}


	public Lettino(float price, String lettinoType){
		this.price = price;
		this.lettinoType = lettinoType;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void setId(long idLettino) {
		this.idLettino = idLettino;
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
	 * @param lettinoType
	 */
	public void setType(String lettinoType) {
		this.lettinoType = lettinoType;
	}

	@Override
	public String toString() {
		return String.format("Lettino: [ tipo: "+ lettinoType+","+"prezzo: "+ price+"€ ]");
	}
}