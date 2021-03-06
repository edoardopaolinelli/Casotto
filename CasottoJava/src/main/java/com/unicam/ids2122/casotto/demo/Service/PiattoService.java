package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Piatto;

import java.util.List;

public interface PiattoService {

	/**
	 * 
	 * @param idPiatto
	 * @param namePiatto
	 * @param description
	 * @param price
	 * @param type
	 */
	Piatto createPiatto(long idPiatto, String namePiatto, String description, float price, String type);

	/**
	 * 
	 * @param idPiatto
	 */
	void deletePiatto(long idPiatto);

	/**
	 * 
	 * @param idPiatto
	 */
	Piatto getPiatto(long idPiatto);

	List<Piatto> getAllPiatti();

	/**
	 * 
	 * @param type
	 */
	List<Piatto> getPiattiByType(String type);

}