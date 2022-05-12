package CasottoJava.Modello_di_Progetto.Repository;

import CasottoJava.Modello_di_Progetto.Entity.Guest;

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