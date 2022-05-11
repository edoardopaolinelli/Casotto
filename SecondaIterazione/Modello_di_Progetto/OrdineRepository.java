package SecondaIterazione.Modello_di_Progetto;

import java.util.List;

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
	Ordine findById(String id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ordine o);

}