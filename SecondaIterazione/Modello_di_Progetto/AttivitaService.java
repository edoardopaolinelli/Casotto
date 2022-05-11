package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

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
	Attivita createAttivita(String idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, Date date, Hour hour);

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
	 * @param idCliente
	 */
	void addCliente(String idCliente);

	/**
	 * 
	 * @param idCliente
	 */
	void removeCliente(String idCliente);

	/**
	 * 
	 * @param date
	 */
	List<Attivita> getAttivitaByDate(Date date);

}