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
	 * @param idLettino
	 * @param price
	 * @param type
	 */
	public Lettino createLettino(String idLettino, float price, String type) {
		Lettino lettino = new Lettino(idLettino, price, type);
		lettinoRepository.save(lettino);
		return lettino;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void deleteLettino(String idLettino) {
		Lettino lettino = lettinoRepository.findById(idLettino);
		lettinoRepository.delete(lettino);
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(String idLettino) {
		return lettinoRepository.findById(idLettino);
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