package SecondaIterazione.Modello_di_Progetto;

public class Piatto {

	private long id;
	private string name;
	private string description;
	private float price;
	private string piattoType;

	public long getId() {
		return this.id;
	}

	public string getName() {
		return this.name;
	}

	public string getDescription() {
		return this.description;
	}

	public float getPrice() {
		return this.price;
	}

	public string getType() {
		// TODO - implement Piatto.getType
		throw new UnsupportedOperationException();
	}

	public long setId() {
		// TODO - implement Piatto.setId
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
	 * @param description
	 */
	public void setDescription(string description) {
		this.description = description;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 
	 * @param piattoType
	 */
	public void setType(string piattoType) {
		// TODO - implement Piatto.setType
		throw new UnsupportedOperationException();
	}

}