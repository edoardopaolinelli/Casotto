package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Prenotazione;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneService {

	/**
	 * 
	 * @param idCliente
	 * @param startDate
	 * @param endDate
	 * @param prenotationType
	 */
	Prenotazione createPrenotazione(long idCliente, LocalDate startDate, LocalDate endDate, String prenotationType, String oggettoPrenotato);

	/**
	 * 
	 * @param idPrenotazione
	 */
	void deletePrenotazione(long idPrenotazione);

	/**
	 * 
	 * @param idPrenotazione
	 */
	Prenotazione getPrenotazione(long idPrenotazione);

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
	List<Prenotazione> getPrenotazioniByCliente(long idCliente);

	/**
	 * 
	 * @param startDate
	 */
	List<Prenotazione> getPrenotazionyByStartDate(LocalDate startDate);

}