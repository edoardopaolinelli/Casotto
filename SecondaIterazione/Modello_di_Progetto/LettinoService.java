package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface LettinoService {

	/**
	 * 
	 * @param idLettino
	 * @param price
	 * @param type
	 */
	Lettino createLettino(string idLettino, float price, string type);

	/**
	 * 
	 * @param idLettino
	 */
	void deleteLettino(string idLettino);

	/**
	 * 
	 * @param idLettino
	 */
	Lettino getLettino(string idLettino);

	List<Lettino> getAllLettini();

	/**
	 * 
	 * @param lettinoType
	 */
	List<Lettino> getLettiniByType(string lettinoType);

}