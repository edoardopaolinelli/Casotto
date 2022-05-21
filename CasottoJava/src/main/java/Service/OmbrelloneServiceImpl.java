package Service;

import Entity.Ombrellone;
import Repository.OmbrelloneRepository;

import java.util.List;

public class OmbrelloneServiceImpl implements OmbrelloneService {

	private OmbrelloneRepository ombrelloneRepository;
	private OmbrelloneService ombrelloneService;

	public OmbrelloneServiceImpl(OmbrelloneRepository ombrelloneRepository) {
		this.ombrelloneRepository = ombrelloneRepository;
	}


	/**
	 * 
	 * @param idOmbrellone
	 * @param price
	 * @param type
	 */
	public Ombrellone createOmbrellone(String idOmbrellone, float price, String type) {
		Ombrellone ombrellone = new Ombrellone(idOmbrellone, price, type);
		ombrelloneRepository.save(ombrellone);
		return ombrellone;
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public void deleteOmbrellone(String idOmbrellone) {
		Ombrellone ombrellone = ombrelloneRepository.findById(idOmbrellone);
		ombrelloneRepository.delete(ombrellone);
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public Ombrellone getOmbrellone(String idOmbrellone) {
		return ombrelloneRepository.findById(idOmbrellone);
	}

	public List<Ombrellone> getAllOmbrelloni() {
		return ombrelloneRepository.findAll();
	}

	/**
	 * 
	 * @param ombrelloneType
	 */
	public List<Ombrellone> getOmbrelloniByType(String ombrelloneType) {
		return ombrelloneRepository.findAll().stream().filter(o -> o.getType().equals(ombrelloneType)).toList();
	}

}