package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Promozione;
import com.unicam.ids2122.casotto.demo.Service.PromozioneService;

import java.util.List;

public class PromozioneController {

	private PromozioneService promozioneService;

	/**
	 * 
	 * @param idPromozine
	 */
	public Promozione getPromozione(String idPromozine) {
		return promozioneService.getPromozione(idPromozine);
	}

	public List<Promozione> getAllPromozioni() {
		return promozioneService.getAllPromozioni();
	}

	/**
	 * 
	 * @param p
	 */
	public void addPromozione(Promozione p) {
		String idPrenotazione = p.getIdPromozione();
		promozioneService.createPromozione(idPrenotazione, p.getName(), p.getDescription(), p.getStartDate(), p.getEndDate());
	}

	/**
	 * 
	 * @param p
	 */
	public void removePromozione(Promozione p) {
		promozioneService.deletePromozione(p.getIdPromozione());
	}

}