package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;

import java.util.List;

public interface LettinoService {

	/**
	 * 
	 * @param idLettino
	 * @param price
	 * @param type
	 */
	Lettino createLettino(String idLettino, float price, String type);

	/**
	 * 
	 * @param idLettino
	 */
	void deleteLettino(String idLettino);

	/**
	 * 
	 * @param idLettino
	 */
	Lettino getLettino(String idLettino);

	List<Lettino> getAllLettini();

	/**
	 * 
	 * @param lettinoType
	 */
	List<Lettino> getLettiniByType(String lettinoType);

}