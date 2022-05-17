package Entity;

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

	public Attivita(){}

	public Attivita(String idAttivita, String name, String description, int maxParticipants, int actualParticipants, LocalDate date, LocalTime hour) {
		this.idAttivita = idAttivita;
		this.name = name;
		this.description = description;
		this.maxParticipants = maxParticipants;
		this.actualParticipants = actualParticipants;
		this.date = date;
		this.hour = hour;
	}

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
		this.idAttivita = idAttivita;
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
		this.maxParticipants = maxPartecipants;
	}

	/**
	 * 
	 * @param actualPartecipants
	 */
	public void setActualPartecipants(int actualPartecipants) {
		this.actualParticipants = actualPartecipants;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(LocalDate date) {
		if(date.isBefore(LocalDate.now())) throw new IllegalArgumentException("Inserire una data valida");
		this.date = date;
	}

	/**
	 * 
	 * @param hour
	 */
	public void setHour(LocalTime hour) {
		if(date.isEqual(LocalDate.now()) && hour.isBefore(LocalTime.now())) throw new IllegalArgumentException("Inserire un'ora valida");
		this.hour = hour;
	}

}