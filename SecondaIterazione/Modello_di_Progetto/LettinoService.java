package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

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