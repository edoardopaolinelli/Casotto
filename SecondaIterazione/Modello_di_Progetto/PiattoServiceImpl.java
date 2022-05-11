package SecondaIterazione.Modello_di_Progetto;

public class PiattoServiceImpl implements PiattoService {

	private PiattoRepository piattoRepository;
	private PiattoService piattoService;

	/**
	 * 
	 * @param idPiatto
	 * @param namePiatto
	 * @param description
	 * @param price
	 * @param type
	 */
	public Piatto createPiatto(long idPiatto, String namePiatto, String description, float price, String type) {
		// TODO - implement PiattoServiceImpl.createPiatto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 */
	public void deletePiatto(long idPiatto) {
		// TODO - implement PiattoServiceImpl.deletePiatto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPiatto
	 */
	public Piatto getPiatto(long idPiatto) {
		// TODO - implement PiattoServiceImpl.getPiatto
		throw new UnsupportedOperationException();
	}

	public List<Piatto> getAllPiatti() {
		// TODO - implement PiattoServiceImpl.getAllPiatti
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 */
	public List<Piatto> getPiattiByType(String type) {
		// TODO - implement PiattoServiceImpl.getPiattiByType
		throw new UnsupportedOperationException();
	}

}