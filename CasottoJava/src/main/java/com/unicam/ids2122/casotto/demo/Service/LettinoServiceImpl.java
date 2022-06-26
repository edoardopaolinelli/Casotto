package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;
import com.unicam.ids2122.casotto.demo.Repository.LettinoRepository;

import java.util.List;

public class LettinoServiceImpl implements LettinoService {

	private final LettinoRepository lettinoRepository;
	private LettinoService lettinoService;

	public LettinoServiceImpl(LettinoRepository lettinoRepository) {
		this.lettinoRepository = lettinoRepository;
	}


	/**
	 * 
	 * @param price
	 * @param type
	 */
	public Lettino createLettino( float price, String type) {
		Lettino lettino = new Lettino( price, type);
		lettinoRepository.save(lettino);
		return lettino;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void deleteLettino(long idLettino) {
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(long idLettino) {
		return null;
	}

	public List<Lettino> getAllLettini() {
		return lettinoRepository.findAll();
	}

	/**
	 * 
	 * @param lettinoType
	 */
	public List<Lettino> getLettiniByType(String lettinoType) {
		return lettinoRepository.findAll().stream().filter(l -> l.getType().equals(lettinoType)).toList();
	}

}