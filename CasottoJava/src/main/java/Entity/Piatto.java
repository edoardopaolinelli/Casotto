package Entity;

public class Piatto {

	private long id;
	private String name;
	private String description;
	private float price;
	private String piattoType;

	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public float getPrice() {
		return this.price;
	}

	public String getType() {
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
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
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
	public void setType(String piattoType) {
		// TODO - implement Piatto.setType
		throw new UnsupportedOperationException();
	}

}