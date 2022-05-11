package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public class LettinoServiceImpl implements LettinoService {

	private LettinoRepository lettinoRepository;
	private LettinoService lettinoService;

	/**
	 * 
	 * @param idLettino
	 * @param price
	 * @param type
	 */
	public Lettino createLettino(string idLettino, float price, string type) {
		// TODO - implement LettinoServiceImpl.createLettino
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void deleteLettino(string idLettino) {
		// TODO - implement LettinoServiceImpl.deleteLettino
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idLettino
	 */
	public Lettino getLettino(string idLettino) {
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
	public List<Lettino> getLettiniByType(string lettinoType) {
		// TODO - implement LettinoServiceImpl.getLettiniByType
		throw new UnsupportedOperationException();
	}

}