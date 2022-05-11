package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface PrenotazioneService {

	/**
	 * 
	 * @param idPrenotazione
	 * @param idUser
	 * @param startDate
	 * @param endDate
	 * @param prenotationType
	 */
	Prenotazione createPrenotazione(string idPrenotazione, string idUser, Date startDate, Date endDate, string prenotationType);

	/**
	 * 
	 * @param idPrenotazione
	 */
	void deletePrenotazione(string idPrenotazione);

	/**
	 * 
	 * @param idPrenotazione
	 */
	Prenotazione getPrenotazione(int idPrenotazione);

	List<Prenotazione> getAllPrenotazioni();

	/**
	 * 
	 * @param prenotazioneType
	 */
	List<Prenotazione> getPrenotazioniByType(string prenotazioneType);

	/**
	 * 
	 * @param idCliente
	 */
	List<Prenotazione> getPrenotazioniByCliente(string idCliente);

	/**
	 * 
	 * @param startDate
	 */
	List<Prenotazione> getPrenotazionyByStartDate(Date startDate);

}