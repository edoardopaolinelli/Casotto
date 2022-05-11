package PrimaIterazione.ModelloDiProgetto;

public class Guest {

	private String idGuest;
	private String name;
	private String surname;
	private String email;
	private String guestType;

	public String getIdGuest() {
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

	/**
	 * 
	 * @param idGuest
	 */
	public void setId(String idGuest) {
		// TODO - implement Guest.setId
		throw new UnsupportedOperationException();
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