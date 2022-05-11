package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface OmbrelloneRepository {

	/**
	 * 
	 * @param o
	 */
	void save(Ombrellone o);

	List<Ombrellone> findAll();

	/**
	 * 
	 * @param id
	 */
	Ombrellone findById(String id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ombrellone o);

}