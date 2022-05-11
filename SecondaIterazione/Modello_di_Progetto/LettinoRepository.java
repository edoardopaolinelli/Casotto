package SecondaIterazione.Modello_di_Progetto;

import java.util.List;

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
	Lettino findById(String id);

	/**
	 * 
	 * @param l
	 */
	void delete(Lettino l);

}