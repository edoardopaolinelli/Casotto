package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;

import java.util.List;

public interface LettinoService {

	/**
	 * 
	 * @param price
	 * @param type
	 */
	Lettino createLettino(float price, String type);

	/**
	 * 
	 * @param idLettino
	 */
	void deleteLettino(long idLettino);

	/**
	 * 
	 * @param idLettino
	 */
	Lettino getLettino(long idLettino);

	List<Lettino> getAllLettini();

	/**
	 * 
	 * @param lettinoType
	 */
	List<Lettino> getLettiniByType(String lettinoType);

}