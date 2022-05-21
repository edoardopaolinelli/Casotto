package Entity;

public class Lettino {

	private String idLettino;
	private float price;

	private String lettinoType;

	public String getIdLettino() {
		return this.idLettino;
	}

	public float getPrice() {
		return this.price;
	}

	public String getType() {
		return this.lettinoType;
	}

	public Lettino(){}


	public Lettino(String idLettino, float price, String lettinoType){
		this.idLettino = idLettino;
		this.price = price;
		this.lettinoType = lettinoType;
	}

	/**
	 * 
	 * @param idLettino
	 */
	public void setId(String idLettino) {
		this.idLettino = idLettino;
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
	 * @param lettinoType
	 */
	public void setType(String lettinoType) {
		this.lettinoType = lettinoType;
	}

}