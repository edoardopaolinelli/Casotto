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
	Prenotazione createPrenotazione(String idPrenotazione, String idUser, Date startDate, Date endDate, String prenotationType);

	/**
	 * 
	 * @param idPrenotazione
	 */
	void deletePrenotazione(String idPrenotazione);

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
	List<Prenotazione> getPrenotazioniByType(String prenotazioneType);

	/**
	 * 
	 * @param idCliente
	 */
	List<Prenotazione> getPrenotazioniByCliente(String idCliente);

	/**
	 * 
	 * @param startDate
	 */
	List<Prenotazione> getPrenotazionyByStartDate(Date startDate);

}