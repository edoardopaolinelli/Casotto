package Service;

import Entity.Guest;

import java.util.List;

public class UserHandlerServiceImpl implements UserHandlerService {

	private UserHandlerService userHandlerService;
	private UserService userService;

	/**
	 * 
	 * @param type
	 * @param email
	 * @param password
	 */
	public List<Long> login(int type, String email, String password) {
		// TODO - implement UserHandlerServiceImpl.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param token
	 */
	public String logout(long token) {
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
	public void signin(int type, String name, String surname, String email, String password) {
		// TODO - implement UserHandlerServiceImpl.signin
		throw new UnsupportedOperationException();
	}

	public List<Guest> getAllUsers() {
		return userService.getAllClienti();
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