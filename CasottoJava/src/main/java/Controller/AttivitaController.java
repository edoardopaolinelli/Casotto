package Controller;

import Entity.Attivita;
import Service.AttivitaService;

import java.util.List;

public class AttivitaController {

	private AttivitaService attivitaService;

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
		// TODO - implement AttivitaController.addAttivita
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param a
	 */
	public void removeAttivita(Attivita a) {
		// TODO - implement AttivitaController.removeAttivita
		throw new UnsupportedOperationException();
	}

}