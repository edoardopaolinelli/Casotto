package Service;

import Entity.Promozione;
import Repository.PromozioneRepository;

import java.time.LocalDate;
import java.util.List;

public class PromozioneServiceImpl implements PromozioneService {

	private PromozioneRepository promozioneRepository;
	private PromozioneService promozioneService;

	public PromozioneServiceImpl(PromozioneRepository promozioneRepository) {
		this.promozioneRepository = promozioneRepository;
	}

	/**
	 * 
	 * @param idPromozione
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 */
	public Promozione createPromozione(String idPromozione, String name, String description, LocalDate startDate, LocalDate endDate) {
		Promozione promozione = new Promozione(idPromozione, name, description, startDate, endDate);
		promozioneRepository.save(promozione);
		return promozione;
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public void deletePromozione(String idPromozione) {
		Promozione promozione = promozioneRepository.findById(idPromozione);
		promozioneRepository.delete(promozione);
	}

	/**
	 * 
	 * @param idPromozione
	 */
	public Promozione getPromozione(String idPromozione) {
		return promozioneRepository.findById(idPromozione);
	}

	public List<Promozione> getAllPromozioni() {
		return promozioneRepository.findAll();
	}

	/**
	 * 
	 * @param startDate
	 */
	public List<Promozione> getPromozioniByStartDate(LocalDate startDate) {
		return promozioneRepository.findAll().stream().filter(p -> p.getStartDate().isEqual(startDate)).toList();
	}

}