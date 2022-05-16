package CasottoJava.Modello_di_Progetto.Controller;

import CasottoJava.Modello_di_Progetto.Entity.Guest;
import CasottoJava.Modello_di_Progetto.Service.UserHandlerService;

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
		try {
			return userHandlerService.login(email,password);
		}catch(Exception e){

		}
	}

	/**
	 * 
	 * @param u
	 */
	public void addUser(Guest u) {
		userHandlerService.add(u);
	}

	/**
	 * 
	 * @param u
	 */
	public void removeUser(Guest u) {
		this.userHandlerService.removeUser(u);
	}

}