package SecondaIterazione.Modello_di_Progetto;

public class UserHandlerServiceImpl implements UserHandlerService {

	private UserHandlerService userHandlerService;

	/**
	 * 
	 * @param type
	 * @param email
	 * @param password
	 */
	public List<Long> login(int type, string email, string password) {
		// TODO - implement UserHandlerServiceImpl.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param token
	 */
	public string logout(long token) {
		// TODO - implement UserHandlerServiceImpl.logout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 */
	public void signin(int type, string name, string surname, string email, string password) {
		// TODO - implement UserHandlerServiceImpl.signin
		throw new UnsupportedOperationException();
	}

	public List<User> getAllUsers() {
		// TODO - implement UserHandlerServiceImpl.getAllUsers
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param token
	 */
	public boolean check(long id, long token) {
		// TODO - implement UserHandlerServiceImpl.check
		throw new UnsupportedOperationException();
	}

}