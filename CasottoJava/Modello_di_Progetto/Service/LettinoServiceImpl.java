package CasottoJava.Modello_di_Progetto.Service;

import CasottoJava.Modello_di_Progetto.Entity.Lettino;
import CasottoJava.Modello_di_Progetto.Repository.LettinoRepository;

import java.util.List;

public class LettinoServiceImpl implements LettinoService {

	private LettinoRepository lettinoRepository;
	private LettinoService lettinoService;

	/**
	 * 
	 * @param idLettino
	 * @param price
	 * @param type
	 */
	public Lettino createLettino(String idLettino, float price, String type) {
		// TODO - implement LettinoServiceImpl.createLettino
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void deleteLettino(String idLettino) {
		// TODO - implement LettinoServiceImpl.deleteLettino
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(String idLettino) {
		// TODO - implement LettinoServiceImpl.getLettino
		throw new UnsupportedOperationException();
	}

	public List<Lettino> getAllLettini() {
		// TODO - implement LettinoServiceImpl.getAllLettini
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lettinoType
	 */
	public List<Lettino> getLettiniByType(String lettinoType) {
		// TODO - implement LettinoServiceImpl.getLettiniByType
		throw new UnsupportedOperationException();
	}

}