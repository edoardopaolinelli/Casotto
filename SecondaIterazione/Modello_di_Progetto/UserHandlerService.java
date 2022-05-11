package SecondaIterazione.Modello_di_Progetto;

public interface UserHandlerService {

	/**
	 * 
	 * @param type
	 * @param email
	 * @param password
	 */
	List<Long> login(int type, string email, string password);

	/**
	 * 
	 * @param token
	 */
	string logout(long token);

	/**
	 * 
	 * @param type
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 */
	void signin(int type, string name, string surname, string email, string password);

	List<User> getAllUsers();

	/**
	 * 
	 * @param id
	 * @param token
	 */
	boolean check(long id, long token);

}