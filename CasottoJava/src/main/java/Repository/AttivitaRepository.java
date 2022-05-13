package Repository;

import Entity.Attivita;

import java.util.List;

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