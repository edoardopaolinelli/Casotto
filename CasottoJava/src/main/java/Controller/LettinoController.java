package Controller;

import Entity.Lettino;
import Repository.LettinoRepository;
import Service.LettinoService;
import Service.LettinoServiceImpl;

import java.util.List;

public class LettinoController {

	private LettinoService lettinoService;

	public LettinoController(LettinoService lettinoService){
		this.lettinoService = lettinoService;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(String idLettino) {

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
		String lettino = l.getIdLettino();
		lettinoService.createLettino(lettino, l.getPrice(), l.getType());
	}

	/**
	 * 
	 * @param l
	 */
	public void removeLettino(Lettino l) {
		String lettino = l.getIdLettino();
		lettinoService.deleteLettino(lettino);
	}

}