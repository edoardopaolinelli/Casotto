package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

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
	Ordine createOrdine(string idOrdine, string idCliente, float price, List orderedDishes, Date startOrder, Date endOrder);

	/**
	 * 
	 * @param idOrdine
	 */
	void deleteOrdine(string idOrdine);

	/**
	 * 
	 * @param idOrdine
	 */
	Ordine getOrdine(string idOrdine);

	List<Ordine> getAllOrdini();

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	void confirmOrdine(string idOrdine, string idCliente);

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	void declineOrdine(string idOrdine, string idCliente);

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	void addPiatto(long idPiatto, string idCliente, int amount);

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	void removePiatto(long idPiatto, string idCliente, int amount);

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
	 * @param Date
	 */
	List<Ordine> getOrdiniByDate(date Date);

}