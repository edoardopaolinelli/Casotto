package Repository;

import Entity.Ordine;

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