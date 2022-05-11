package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface AttivitaRepository {

	/**
	 * 
	 * @param a
	 */
	void save(Attivita a);

	List<Attivita> findAll();

	/**
	 * 
	 * @param id
	 */
	Attivita findById(String id);

	/**
	 * 
	 * @param a
	 */
	void delete(Attivita a);

}