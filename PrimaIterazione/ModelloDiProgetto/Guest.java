package PrimaIterazione.ModelloDiProgetto;

public class Guest {

	private string idGuest;
	private string name;
	private string surname;
	private string email;
	private string guestType;

	public string getIdGuest() {
		return this.idGuest;
	}

	public string getName() {
		return this.name;
	}

	public string getSurname() {
		return this.surname;
	}

	public string getEmail() {
		return this.email;
	}

	public string getGuestType() {
		return this.guestType;
	}

	/**
	 * 
	 * @param idGuest
	 */
	public void setId(string idGuest) {
		// TODO - implement Guest.setId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(string surname) {
		this.surname = surname;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(string email) {
		this.email = email;
	}

	/**
	 * 
	 * @param guestType
	 */
	public void setGuestType(string guestType) {
		this.guestType = guestType;
	}

}