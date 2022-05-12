package SecondaIterazione.Modello_di_Progetto.Service;

import SecondaIterazione.Modello_di_Progetto.Entity.Guest;

import java.util.List;

public interface UserHandlerService {

	/**
	 * 
	 * @param type
	 * @param email
	 * @param password
	 */
	List<Long> login(int type, String email, String password);

	/**
	 * 
	 * @param token
	 */
	String logout(long token);

	/**
	 * 
	 * @param type
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 */
	void signin(int type, String name, String surname, String email, String password);

	List<Guest> getAllUsers();

	/**
	 * 
	 * @param id
	 * @param token
	 */
	boolean check(long id, long token);

}