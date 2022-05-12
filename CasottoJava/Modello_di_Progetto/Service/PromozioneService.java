package CasottoJava.Modello_di_Progetto.Service;


import CasottoJava.Modello_di_Progetto.Entity.Promozione;

import java.time.LocalDate;
import java.util.List;

public interface PromozioneService {

	/**
	 * 
	 * @param idPromozione
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 */
	Promozione createPromozione(String idPromozione, String name, String description, LocalDate startDate, LocalDate endDate);

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
	List<Promozione> getPromozioniByStartDate(LocalDate startDate);

}