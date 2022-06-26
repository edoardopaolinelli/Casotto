package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;
import com.unicam.ids2122.casotto.demo.Repository.LettinoRepository;
import com.unicam.ids2122.casotto.demo.Service.LettinoService;
import com.unicam.ids2122.casotto.demo.Service.LettinoServiceImpl;

import java.util.List;

public class LettinoController {

	private final LettinoService lettinoService;

	public LettinoController(LettinoService lettinoService){
		this.lettinoService = lettinoService;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(long idLettino) {

		return lettinoService.getLettino(idLettino);
	}

	public List<Lettino> getAllLettini() {
	return lettinoService.getAllLettini();
	}

	/**
	 * 
	 * @param l
	 */
	public void addLettino(Lettino l) {
		lettinoService.createLettino( l.getPrice(), l.getType());
	}

	/**
	 * 
	 * @param l
	 */
	public void removeLettino(Lettino l) {
		long lettino = l.getIdLettino();
		lettinoService.deleteLettino(lettino);
	}

}