package SecondaIterazione.Modello_di_Progetto;

public interface PiattoService {

	/**
	 * 
	 * @param idPiatto
	 * @param namePiatto
	 * @param description
	 * @param price
	 * @param type
	 */
	Piatto createPiatto(long idPiatto, string namePiatto, string description, float price, string type);

	/**
	 * 
	 * @param idPiatto
	 */
	void deletePiatto(long idPiatto);

	/**
	 * 
	 * @param idPiatto
	 */
	Piatto getPiatto(long idPiatto);

	List<Piatto> getAllPiatti();

	/**
	 * 
	 * @param type
	 */
	List<Piatto> getPiattiByType(string type);

}