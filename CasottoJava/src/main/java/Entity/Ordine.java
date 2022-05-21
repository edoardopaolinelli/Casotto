package Entity;

import java.time.LocalDate;
import java.util.List;

public class Ordine {

	private String idOrdine;
	private float price;
	private List<Piatto> orderedDishes;
	private String idCliente;
	private LocalDate startOrder;
	private LocalDate endOrder;

	public Ordine(){}

	public Ordine(String idOrdine, float price, List<Piatto> orderedDishes, String idCliente, LocalDate startOrder, LocalDate endOrder) {
		this.idOrdine = idOrdine;
		this.price = price;
		this.orderedDishes = orderedDishes;
		this.idCliente = idCliente;
		this.startOrder = startOrder;
		this.endOrder = endOrder;
	}

	/**
	 * CAMBIEREI LA DATA IN ORA PER L'ORDINE CHE MI SEMBRA PIÙ GIUSTO NO?
	 * ALLA FINE UNO PRENOTA IL CIBO PER UN'ORA DI SOLITO, NON PER UN GIORNO. @pippo
	 */

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

	public LocalDate getStartOrder() {
		return this.startOrder;
	}

	public LocalDate getEndOrder() {
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
		if(price<0) throw new IllegalArgumentException("Inserire un prezzo valido");
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
	public void setStartOrder(LocalDate startOrder) {
		this.startOrder = startOrder;
	}

	/**
	 * 
	 * @param endOrder
	 */
	public void setEndOrder(LocalDate endOrder) {
		this.endOrder = endOrder;
	}

}