package Controller;

import Entity.Attivita;
import Service.AttivitaService;

import java.util.List;

public class AttivitaController {

	private AttivitaService attivitaService;

	public AttivitaController(AttivitaService attivitaService){
		this.attivitaService = attivitaService;
	}

	/**
	 *
	 * @param idAttivita
	 */
	public Attivita getAttivita(String idAttivita) {
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
		String idAttivita = a.getIdAttivita();
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