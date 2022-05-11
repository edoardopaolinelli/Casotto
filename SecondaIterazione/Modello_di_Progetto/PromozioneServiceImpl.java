package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public class PromozioneServiceImpl implements PromozioneService {

	private PromozioneRepository promozioneRepository;
	private PromozioneService promozioneService;

	/**
	 * 
	 * @param idPromozione
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 */
	public Promozione createPromozione(string idPromozione, string name, string description, Date startDate, Date endDate) {
		// TODO - implement PromozioneServiceImpl.createPromozione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public void deletePromozione(string idPromozione) {
		// TODO - implement PromozioneServiceImpl.deletePromozione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public Promozione getPromozione(string idPromozione) {
		// TODO - implement PromozioneServiceImpl.getPromozione
		throw new UnsupportedOperationException();
	}

	public List<Promozione> getAllPromozioni() {
		// TODO - implement PromozioneServiceImpl.getAllPromozioni
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startDate
	 */
	public List<Promozione> getPromozioniByStartDate(Date startDate) {
		// TODO - implement PromozioneServiceImpl.getPromozioniByStartDate
		throw new UnsupportedOperationException();
	}

}