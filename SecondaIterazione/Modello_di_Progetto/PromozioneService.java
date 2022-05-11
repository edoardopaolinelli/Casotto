package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface PromozioneService {

	/**
	 * 
	 * @param idPromozione
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 */
	Promozione createPromozione(String idPromozione, String name, String description, Date startDate, Date endDate);

	/**
	 * 
	 * @param idPromozione
	 */
	void deletePromozione(String idPromozione);

	/**
	 * 
	 * @param idPromozione
	 */
	Promozione getPromozione(String idPromozione);

	List<Promozione> getAllPromozioni();

	/**
	 * 
	 * @param startDate
	 */
	List<Promozione> getPromozioniByStartDate(Date startDate);

}