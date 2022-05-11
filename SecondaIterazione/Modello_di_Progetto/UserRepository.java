package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface UserRepository {

	/**
	 * 
	 * @param g
	 */
	void save(Guest g);

	List<Guest> findAll();

	/**
	 * 
	 * @param id
	 */
	Guest findById(string id);

	/**
	 * 
	 * @param g
	 */
	void delete(Guest g);

}