package Repository;

import Entity.Guest;

import java.util.List;

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
	Guest findById(String id);

	/**
	 * 
	 * @param g
	 */
	void delete(Guest g);

}