package CasottoJava.Modello_di_Progetto.Service;

import CasottoJava.Modello_di_Progetto.Entity.Ombrellone;

import java.util.List;

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