package Service;

import Entity.Prenotazione;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneService {

	/**
	 * 
	 * @param idPrenotazione
	 * @param idUser
	 * @param startDate
	 * @param endDate
	 * @param prenotationType
	 */
	Prenotazione createPrenotazione(String idPrenotazione, String idUser, LocalDate startDate, LocalDate endDate, String prenotationType, Object oggettoPrenotato);

	/**
	 * 
	 * @param idPrenotazione
	 */
	void deletePrenotazione(String idPrenotazione);

	/**
	 * 
	 * @param idPrenotazione
	 */
	Prenotazione getPrenotazione(String idPrenotazione);

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
	List<Prenotazione> getPrenotazionyByStartDate(LocalDate startDate);

}