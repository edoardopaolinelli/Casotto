package Controller;

import Entity.Guest;
import Service.UserHandlerService;

import java.util.List;

public class UserController {

	private UserHandlerService userHandlerService;

	/**
	 * 
	 * @param idUser
	 */
	public Guest getUser(int idUser) {
		return this.userHandlerService.getAllUsers().get(idUser);
	}

	public List<Guest> getAllUsers() {
		return userHandlerService.getAllUsers();
	}

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) {

	}

	/**
	 * 
	 * @param u
	 */
	public void addUser(Guest u) {
	}

	/**
	 * 
	 * @param u
	 */
	public void removeUser(Guest u) {

	}

}