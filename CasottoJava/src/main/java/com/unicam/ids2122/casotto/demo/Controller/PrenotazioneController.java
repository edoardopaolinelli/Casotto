package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Prenotazione;
import com.unicam.ids2122.casotto.demo.Service.PrenotazioneService;

import java.util.List;

public class PrenotazioneController {

	private PrenotazioneService prenotazioneService;

	/**
	 * 
	 * @param idPrenotazione
	 */
	public Prenotazione getPrenotazione(long idPrenotazione) {
		if (prenotazioneService == null) {
			throw new NullPointerException("Prenotazione is null");
		}
		return prenotazioneService.getPrenotazione(idPrenotazione);
	}

	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneService.getAllPrenotazioni();
	}

	/**
	 * 
	 * @param p
	 */
	public void addPrenotazione(Prenotazione p) {
		if(p == null) {
			throw new NullPointerException("Prenotazione is null");
		}
		else if( prenotazioneService.getAllPrenotazioni().contains(p)) {
			throw new IllegalArgumentException("Prenotazione already exists");
		}
		prenotazioneService.createPrenotazione(p.getIdCliente(), p.getStartDate(), p.getEndDate(), p.getPrenotationType(), p.getOggettoPrenotato());
	}

	/**
	 * 
	 * @param p
	 */
	public void removePrenotazione(Prenotazione p) {
		if( prenotazioneService.getAllPrenotazioni().contains(p)) {
			prenotazioneService.deletePrenotazione(p.getIdPrenotazione());
		}
		else {
			throw new IllegalArgumentException("Prenotazione does not exist");
		}
	}

}