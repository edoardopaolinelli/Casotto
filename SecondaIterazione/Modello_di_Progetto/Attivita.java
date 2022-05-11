package SecondaIterazione.Modello_di_Progetto;

public class Attivita {

	private String idAttivita;
	private String name;
	private String description;
	private int maxParticipants;
	private int actualParticipants;
	private Date date;
	private Hour hour;

	public String getIdAttivita() {
		return this.idAttivita;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public int getMaxParticipants() {
		return this.maxParticipants;
	}

	public int getActualParticipants() {
		return this.actualParticipants;
	}

	public Date getDate() {
		return this.date;
	}

	public Hour getHour() {
		return this.hour;
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void setId(String idAttivita) {
		// TODO - implement Attivita.setId
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
	 * @param maxPartecipants
	 */
	public void setMaxPartecipants(int maxPartecipants) {
		// TODO - implement Attivita.setMaxPartecipants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param actualPartecipants
	 */
	public void setActualPartecipants(int actualPartecipants) {
		// TODO - implement Attivita.setActualPartecipants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param hour
	 */
	public void setHour(Hour hour) {
		this.hour = hour;
	}

}