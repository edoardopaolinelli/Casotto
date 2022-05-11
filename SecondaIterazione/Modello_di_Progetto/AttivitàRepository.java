package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface Attivit‡Repository {

	/**
	 * 
	 * @param a
	 */
	void save(Attivit‡ a);

	List<Attivit‡> findAll();

	/**
	 * 
	 * @param id
	 */
	Attivit‡ findById(string id);

	/**
	 * 
	 * @param a
	 */
	void delete(Attivit‡ a);

}