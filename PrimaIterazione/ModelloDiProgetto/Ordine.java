package PrimaIterazione.ModelloDiProgetto;

import SecondaIterazione.Modello_di_Progetto.*;

public class Ordine {

	private string idOrdine;
	private float price;
	private List<Piatto> orderedDishes;
	private string idCliente;
	private Date startOrder;
	private Date endOrder;

	public string getIdOrdine() {
		return this.idOrdine;
	}

	public string getIdCliente() {
		return this.idCliente;
	}

	public float getPrice() {
		return this.price;
	}

	public List getOrderedDishes() {
		// TODO - implement Ordine.getOrderedDishes
		throw new UnsupportedOperationException();
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
	public void setIdOrdine(string idOrdine) {
		this.idOrdine = idOrdine;
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(string idCliente) {
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