package SecondaIterazione.Modello_di_Progetto;

import java.time.LocalDate;

public class Promozione {

	private String idPromozione;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;

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
		// TODO - implement Promozione.setId
		throw new UnsupportedOperationException();
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