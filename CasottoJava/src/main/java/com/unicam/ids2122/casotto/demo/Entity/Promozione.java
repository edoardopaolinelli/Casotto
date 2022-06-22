package com.unicam.ids2122.casotto.demo.Entity;

import java.time.LocalDate;

public class Promozione {

	private String idPromozione;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;

	public Promozione(){}

	public Promozione(String idPromozione, String name, String description, LocalDate startDate, LocalDate endDate) {
		this.idPromozione = idPromozione;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getIdPromozione() {
		return this.idPromozione;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public void setId(String idPromozione) {
		this.idPromozione = idPromozione;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}