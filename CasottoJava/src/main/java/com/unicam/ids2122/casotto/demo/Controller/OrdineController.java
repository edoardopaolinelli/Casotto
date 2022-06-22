package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Ordine;
import com.unicam.ids2122.casotto.demo.Service.OrdineService;

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
		String idOrdine = o.getIdOrdine();
		String idCliente = o.getIdCliente();
		ordineService.createOrdine(idOrdine, idCliente, o.getPrice(), o.getOrderedDishes(), o.getStartOrder(), o.getEndOrder());
	}

	/**
	 * 
	 * @param o
	 */
	public void removeOrdine(Ordine o) {
		ordineService.deleteOrdine(o.getIdOrdine());
	}

}