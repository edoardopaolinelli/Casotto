package Service;

import Entity.Ordine;
import Entity.Piatto;
import Repository.OrdineRepository;
import Repository.PiattoRepository;

import java.time.LocalDate;
import java.util.List;

public class OrdineServiceImpl implements OrdineService<Piatto> {

	private OrdineRepository ordineRepository;
	private OrdineService ordineService;
	private PiattoRepository piattoRepository;

	public OrdineServiceImpl(OrdineRepository ordineRepository, PiattoRepository piattoRepository) {
		this.ordineRepository = ordineRepository;
		this.piattoRepository = piattoRepository;
	}


	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 * @param price
	 * @param orderedDishes
	 * @param startOrder
	 * @param endOrder
	 */
	public Ordine createOrdine(String idOrdine, String idCliente, float price, List<Piatto> orderedDishes, LocalDate startOrder, LocalDate endOrder) {
		return new Ordine(idOrdine,  price, orderedDishes, idCliente, startOrder, endOrder);
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public void deleteOrdine(String idOrdine) {
		Ordine ordine = ordineRepository.findById(idOrdine);
		ordineRepository.delete(ordine);
	}

	/**
	 * 
	 * @param idOrdine
	 */
	public Ordine getOrdine(String idOrdine) {
		return ordineRepository.findById(idOrdine);
	}

	public List<Ordine> getAllOrdini() {
		return ordineRepository.findAll();
	}

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	public void confirmOrdine(String idOrdine, String idCliente) {
		// TODO - implement OrdineServiceImpl.confirmOrdine
		throw new UnsupportedOperationException();
		//?
	}

	/**
	 * 
	 * @param idOrdine
	 * @param idCliente
	 */
	public void declineOrdine(String idOrdine, String idCliente) {
		// TODO - implement OrdineServiceImpl.declineOrdine
		throw new UnsupportedOperationException();
		//?
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void addPiatto(long idPiatto, String idCliente, int amount) {
		Piatto piatto = piattoRepository.findById(idPiatto);
		//Serve l'id dell'ordine altrimenti non sappiamo a che ordine aggiungerlo.
	}

	/**
	 * 
	 * @param idPiatto
	 * @param idCliente
	 * @param amount
	 */
	public void removePiatto(long idPiatto, String idCliente, int amount) {
		Piatto piatto = piattoRepository.findById(idPiatto);
		//Serve l'id dell'ordine altrimenti non sappiamo da che ordine rimuoverlo.
	}

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	public void incrementAmount(long idPiatto, int amount) {
		Piatto piatto = piattoRepository.findById(idPiatto);
		//Serve l'id dell'ordine.
	}

	/**
	 * 
	 * @param idPiatto
	 * @param amount
	 */
	public void decrementAmount(long idPiatto, int amount) {
		Piatto piatto = piattoRepository.findById(idPiatto);
		//Serve l'id dell'ordine.
	}

	/**
	 * 
	 * @param date
	 */
	public List<Ordine> getOrdiniByDate(LocalDate date) {
		return ordineRepository.findAll().stream().filter(o -> o.getStartOrder().isEqual(date)).toList();
	}

}