package Service;

import Entity.Attivita;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AttivitaService {

	/**
	 * 
	 * @param idAttivita
	 * @param name
	 * @param description
	 * @param maxPartecipants
	 * @param actualPartecipants
	 * @param date
	 * @param hour
	 */
	Attivita createAttivita(String idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, LocalDate date, LocalTime hour);

	/**
	 * 
	 * @param idAttivita
	 */
	void deleteAttivita(String idAttivita);

	/**
	 * 
	 * @param idAttivita
	 */
	Attivita getAttivita(String idAttivita);

	List<Attivita> getAllAttivita();

	/**
	 * 
	 * @param idAttivita
	 */
	void addttivita(String idAttivita);

	/**
	 * 
	 * @param idAttivita
	 */
	void removeAttivita(String idAttivita);

	/**
	 * 
	 * @param date
	 */
	List<Attivita> getAttivitaByDate(LocalDate date);

}