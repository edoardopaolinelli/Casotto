package CasottoJava.Modello_di_Progetto.Service;

import CasottoJava.Modello_di_Progetto.Entity.Ordine;
import CasottoJava.Modello_di_Progetto.Repository.PiattoRepository;
import CasottoJava.Modello_di_Progetto.Repository.OrdineRepository;

import java.time.LocalDate;
import java.util.List;

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
	public Ordine createOrdine(String idOrdine, String idCliente, float price, List orderedDishes, LocalDate startOrder, LocalDate endOrder) {
		// TODO - implement OrdineServiceImpl.createOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public void deleteOrdine(String idOrdine) {
		// TODO - implement OrdineServiceImpl.deleteOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public Ordine getOrdine(String idOrdine) {
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
	public void confirmOrdine(String idOrdine, String idCliente) {
		// TODO - implement OrdineServiceImpl.confirmOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	public void declineOrdine(String idOrdine, String idCliente) {
		// TODO - implement OrdineServiceImpl.declineOrdine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void addPiatto(long idPiatto, String idCliente, int amount) {
		// TODO - implement OrdineServiceImpl.addPiatto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void removePiatto(long idPiatto, String idCliente, int amount) {
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
	 * @param date
	 */
	public List<Ordine> getOrdiniByDate(LocalDate date) {
		// TODO - implement OrdineServiceImpl.getOrdiniByDate
		throw new UnsupportedOperationException();
	}

}