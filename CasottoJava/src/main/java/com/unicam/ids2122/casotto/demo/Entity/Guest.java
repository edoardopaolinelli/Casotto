package com.unicam.ids2122.casotto.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Guest {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idGuest;
	private String name;
	private String surname;
	private String email;

	private String password;
	private String guestType;

	protected Guest(){}

	public Guest(String name, String surname, String email, String password){
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = String.valueOf(password.hashCode() * 31);
	}

	public Guest(String email, String password){
		this.email = email;
		this.password = password;
	}

	public long getIdGuest() {
		return this.idGuest;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getEmail() {
		return this.email;
	}

	public String getGuestType() {
		return this.guestType;
	}

	public String getPassword() {return this.password;}

	@Override
	public String toString() {
		return String.format("Guest[id=%d, name='%s', surname='%s', email='%s']",
				idGuest, name, surname, email);
	}

	/**
	 * 
	 * @param idGuest
	 */
	public void setId(long idGuest) {
		this.idGuest = idGuest;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @param guestType
	 */
	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}

}