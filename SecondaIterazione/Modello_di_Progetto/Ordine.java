package SecondaIterazione.Modello_di_Progetto;

public class Ordine {

	private String idOrdine;
	private float price;
	private List<Piatto> orderedDishes;
	private String idCliente;
	private Date startOrder;
	private Date endOrder;

	public String getIdOrdine() {
		return this.idOrdine;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public float getPrice() {
		return this.price;
	}

	public List<Piatto> getOrderedDishes() {
		return this.orderedDishes;
	}

	public Date getStartOrder() {
		return this.startOrder;
	}

	public Date getEndOrder() {
		return this.endOrder;
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public void setIdOrdine(String idOrdine) {
		this.idOrdine = idOrdine;
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
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
	 * @param orderedDishes
	 */
	public void setOrderedDishes(List<Piatto> orderedDishes) {
		this.orderedDishes = orderedDishes;
	}

	/**
	 * 
	 * @param startOrder
	 */
	public void setStartOrder(Date startOrder) {
		this.startOrder = startOrder;
	}

	/**
	 * 
	 * @param endOrder
	 */
	public void setEndOrder(Date endOrder) {
		this.endOrder = endOrder;
	}

}