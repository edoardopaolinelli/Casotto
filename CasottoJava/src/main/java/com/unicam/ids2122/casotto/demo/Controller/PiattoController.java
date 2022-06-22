package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Piatto;
import com.unicam.ids2122.casotto.demo.Service.PiattoService;

import java.util.List;

public class PiattoController {

	private PiattoService piattoService;

	/**
	 * 
	 * @param idPiatto
	 */
public Piatto getPiatto(long idPiatto) {
		return piattoService.getPiatto( idPiatto);
	}

	public List<Piatto> getAllPiatti() {
		return piattoService.getAllPiatti();
	}

	/**
	 * 
	 * @param p
	 */
	public void addPiatto(Piatto p) {
		String piatto = p.getName();
		long idPiatto = p.getId();
		piattoService.createPiatto(idPiatto, piatto, p.getDescription(), p.getPrice(), p.getType());
	}

	/**
	 * 
	 * @param p
	 */
	public void removePiatto(Piatto p) {
		piattoService.deletePiatto(p.getId());
	}

}