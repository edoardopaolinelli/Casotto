package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Guest;

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
		return userService.login(type, email, password);

	}

	/**
	 * 
	 * @param token
	 */
	public String logout(long token) {
		return userService.logout(token);
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
		userService.signin(type, name, surname, email, password);
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