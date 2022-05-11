package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface LettinoRepository {

	/**
	 * 
	 * @param l
	 */
	void save(Lettino l);

	List<Lettino> findAll();

	/**
	 * 
	 * @param id
	 */
	Lettino findById(string id);

	/**
	 * 
	 * @param l
	 */
	void delete(Lettino l);

}