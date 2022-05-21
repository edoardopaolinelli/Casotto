package Repository;

import Entity.Piatto;

import java.util.List;

public interface PiattoRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Piatto p);

	List<Piatto> findAll();

	/**
	 * 
	 * @param id
	 */
	Piatto findById(long id);

	/**
	 * 
	 * @param p
	 */
	void delete(Piatto p);

}