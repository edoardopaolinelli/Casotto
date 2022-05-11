package SecondaIterazione.Modello_di_Progetto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attivita {

	private String idAttivita;
	private String name;
	private String description;
	private int maxParticipants;
	private int actualParticipants;
	private LocalDate date;
	private LocalTime hour;

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

	public LocalDate getDate() {
		return this.date;
	}

	public LocalTime getHour() {
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
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * 
	 * @param hour
	 */
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

}