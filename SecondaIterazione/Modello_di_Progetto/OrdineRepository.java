package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface OrdineRepository {

	/**
	 * 
	 * @param o
	 */
	void save(Ordine o);

	List<Ordine> findAll();

	/**
	 * 
	 * @param id
	 */
	Ordine findById(string id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ordine o);

}