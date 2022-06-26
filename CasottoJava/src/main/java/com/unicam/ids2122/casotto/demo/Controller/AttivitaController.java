package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import com.unicam.ids2122.casotto.demo.Service.AttivitaService;

import java.util.List;

public class AttivitaController {

	private final AttivitaService attivitaService;

	public AttivitaController(AttivitaService attivitaService){
		this.attivitaService = attivitaService;
	}

	/**
	 *
	 * @param idAttivita
	 */
	public Attivita getAttivita(long idAttivita) {
		return attivitaService.getAttivita(idAttivita);
	}

	public List<Attivita> getAllAttivita() {
		return attivitaService.getAllAttivita();
	}

	/**
	 * 
	 * @param a
	 */
	public void addAttivita(Attivita a) {
		long idAttivita = a.getIdAttivita();
		attivitaService.createAttivita(idAttivita, a.getName(), a.getDescription(), a.getMaxParticipants(), a.getActualParticipants(), a.getDate(), a.getHour());
	}

	/**
	 * 
	 * @param a
	 */
	public void removeAttivita(Attivita a) {
		attivitaService.deleteAttivita(a.getIdAttivita());
	}

}