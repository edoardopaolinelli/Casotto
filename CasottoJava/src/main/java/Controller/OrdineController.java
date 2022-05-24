package Controller;

import Entity.Ordine;
import Service.OrdineService;

import java.util.List;

public class OrdineController {

	private OrdineService ordineService;

	/**
	 * 
	 * @param idOrdine
	 */
	public Ordine getOrdine(String idOrdine) {
		return ordineService.getOrdine(idOrdine);
	}

	public List<Ordine> getAllOrdini() {
		return ordineService.getAllOrdini();
	}

	/**
	 * 
	 * @param o
	 */
	public void addOrdine(Ordine o) {
		// TODO - implement OrdineController.addOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void removeOrdine(Ordine o) {
		// TODO - implement OrdineController.removeOrdine
		throw new UnsupportedOperationException();
	}

}