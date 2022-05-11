package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface Attivit‡Service {

	/**
	 * 
	 * @param idAttivit‡
	 * @param name
	 * @param description
	 * @param maxPartecipants
	 * @param actualPartecipants
	 * @param date
	 * @param hour
	 */
	Attivit‡ createAttivit‡(string idAttivit‡, string name, string description, int maxPartecipants, int actualPartecipants, Date date, Hour hour);

	/**
	 * 
	 * @param idAttivit‡
	 */
	void deleteAttivit‡(string idAttivit‡);

	/**
	 * 
	 * @param idAttivit‡
	 */
	Attivit‡ getAttivit‡(string idAttivit‡);

	List<Attivit‡> getAllAttivit‡();

	/**
	 * 
	 * @param idCliente
	 */
	void addCliente(string idCliente);

	/**
	 * 
	 * @param idCliente
	 */
	void removeCliente(string idCliente);

	/**
	 * 
	 * @param date
	 */
	List<Attivit‡> getAttivit‡ByDate(Date date);

}