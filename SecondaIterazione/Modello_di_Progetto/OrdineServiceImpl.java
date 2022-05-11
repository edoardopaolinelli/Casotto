package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public class OrdineServiceImpl implements OrdineService {

	private OrdineRepository ordineRepository;
	private OrdineService ordineService;
	private PiattoRepository piattoRepository;

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 * @param price
	 * @param orderedDishes
	 * @param startOrder
	 * @param endOrder
	 */
	public Ordine createOrdine(string idOrdine, string idCliente, float price, List orderedDishes, Date startOrder, Date endOrder) {
		// TODO - implement OrdineServiceImpl.createOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public void deleteOrdine(string idOrdine) {
		// TODO - implement OrdineServiceImpl.deleteOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public Ordine getOrdine(string idOrdine) {
		// TODO - implement OrdineServiceImpl.getOrdine
		throw new UnsupportedOperationException();
	}

	public List<Ordine> getAllOrdini() {
		// TODO - implement OrdineServiceImpl.getAllOrdini
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	public void confirmOrdine(string idOrdine, string idCliente) {
		// TODO - implement OrdineServiceImpl.confirmOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	public void declineOrdine(string idOrdine, string idCliente) {
		// TODO - implement OrdineServiceImpl.declineOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void addPiatto(long idPiatto, string idCliente, int amount) {
		// TODO - implement OrdineServiceImpl.addPiatto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void removePiatto(long idPiatto, string idCliente, int amount) {
		// TODO - implement OrdineServiceImpl.removePiatto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	public void incrementAmount(long idPiatto, int amount) {
		// TODO - implement OrdineServiceImpl.incrementAmount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	public void decrementAmount(long idPiatto, int amount) {
		// TODO - implement OrdineServiceImpl.decrementAmount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Date
	 */
	public List<Ordine> getOrdiniByDate(date Date) {
		// TODO - implement OrdineServiceImpl.getOrdiniByDate
		throw new UnsupportedOperationException();
	}

}