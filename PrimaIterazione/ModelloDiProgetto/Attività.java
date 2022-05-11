package PrimaIterazione.ModelloDiProgetto;

public class Attività {

	private string idAttività;
	private string name;
	private string description;
	private int maxParticipants;
	private int actualParticipants;
	private Date date;
	private Hour hour;

	public string getIdAttività() {
		return this.idAttività;
	}

	public string getName() {
		return this.name;
	}

	public string getDescription() {
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
	 * @param idAttività
	 */
	public void setId(string idAttività) {
		// TODO - implement Attività.setId
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
	 * @param maxPartecipants
	 */
	public void setMaxPartecipants(int maxPartecipants) {
		// TODO - implement Attività.setMaxPartecipants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param actualPartecipants
	 */
	public void setActualPartecipants(int actualPartecipants) {
		// TODO - implement Attività.setActualPartecipants
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