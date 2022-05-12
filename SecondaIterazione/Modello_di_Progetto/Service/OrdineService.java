package SecondaIterazione.Modello_di_Progetto.Service;

import SecondaIterazione.Modello_di_Progetto.Entity.Ordine;

import java.time.LocalDate;
import java.util.List;

public interface OrdineService {

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 * @param price
	 * @param orderedDishes
	 * @param startOrder
	 * @param endOrder
	 */
	Ordine createOrdine(String idOrdine, String idCliente, float price, List orderedDishes, LocalDate startOrder, LocalDate endOrder);

	/**
	 * 
	 * @param idOrdine
	 */
	void deleteOrdine(String idOrdine);

	/**
	 * 
	 * @param idOrdine
	 */
	Ordine getOrdine(String idOrdine);

	List<Ordine> getAllOrdini();

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	void confirmOrdine(String idOrdine, String idCliente);

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	void declineOrdine(String idOrdine, String idCliente);

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	void addPiatto(long idPiatto, String idCliente, int amount);

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	void removePiatto(long idPiatto, String idCliente, int amount);

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	void incrementAmount(long idPiatto, int amount);

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	void decrementAmount(long idPiatto, int amount);

	/**
	 * 
	 * @param date
	 */
	List<Ordine> getOrdiniByDate(LocalDate date);

}