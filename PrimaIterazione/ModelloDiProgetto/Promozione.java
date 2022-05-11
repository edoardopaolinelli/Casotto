package PrimaIterazione.ModelloDiProgetto;

public class Promozione {

	private string idPromozione;
	private string name;
	private string description;
	private Date startDate;
	private Date endDate;

	public string getIdPromozione() {
		return this.idPromozione;
	}

	public string getName() {
		return this.name;
	}

	public string getDescription() {
		return this.description;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public void setId(string idPromozione) {
		// TODO - implement Promozione.setId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(string description) {
		this.description = description;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}