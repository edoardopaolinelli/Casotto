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
	Promozione createPromozione(string idPromozione, string name, string description, Date startDate, Date endDate);

	/**
	 * 
	 * @param idPromozione
	 */
	void deletePromozione(string idPromozione);

	/**
	 * 
	 * @param idPromozione
	 */
	Promozione getPromozione(string idPromozione);

	List<Promozione> getAllPromozioni();

	/**
	 * 
	 * @param startDate
	 */
	List<Promozione> getPromozioniByStartDate(Date startDate);

}