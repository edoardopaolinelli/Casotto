package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface OmbrelloneService {

	/**
	 * 
	 * @param idOmbrellone
	 * @param price
	 * @param type
	 */
	Ombrellone createOmbrellone(string idOmbrellone, float price, string type);

	/**
	 * 
	 * @param idOmbrellone
	 */
	void deleteOmbrellone(string idOmbrellone);

	/**
	 * 
	 * @param idOmbrellone
	 */
	Ombrellone getOmbrellone(string idOmbrellone);

	List<Ombrellone> getAllOmbrelloni();

	/**
	 * 
	 * @param ombrelloneType
	 */
	List<Ombrellone> getOmbrelloniByType(string ombrelloneType);

}