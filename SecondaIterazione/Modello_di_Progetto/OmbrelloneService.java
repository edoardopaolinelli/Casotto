package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface OmbrelloneService {

	/**
	 * 
	 * @param idOmbrellone
	 * @param price
	 * @param type
	 */
	Ombrellone createOmbrellone(String idOmbrellone, float price, String type);

	/**
	 * 
	 * @param idOmbrellone
	 */
	void deleteOmbrellone(String idOmbrellone);

	/**
	 * 
	 * @param idOmbrellone
	 */
	Ombrellone getOmbrellone(String idOmbrellone);

	List<Ombrellone> getAllOmbrelloni();

	/**
	 * 
	 * @param ombrelloneType
	 */
	List<Ombrellone> getOmbrelloniByType(String ombrelloneType);

}