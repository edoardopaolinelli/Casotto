package com.unicam.ids2122.casotto.demo.Controller;

import com.unicam.ids2122.casotto.demo.Entity.Guest;
import com.unicam.ids2122.casotto.demo.Service.UserHandlerService;
import org.springframework.stereotype.Controller;

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