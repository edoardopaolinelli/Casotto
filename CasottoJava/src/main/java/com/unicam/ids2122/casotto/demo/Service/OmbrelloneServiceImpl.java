package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Ombrellone;
import com.unicam.ids2122.casotto.demo.Repository.OmbrelloneRepository;

import java.util.List;

public class OmbrelloneServiceImpl implements OmbrelloneService {

	private final OmbrelloneRepository ombrelloneRepository;
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
		Ombrellone ombrellone = new Ombrellone(price, type);
		ombrelloneRepository.save(ombrellone);
		return ombrellone;
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public void deleteOmbrellone(String idOmbrellone) {
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public Ombrellone getOmbrellone(String idOmbrellone) {
		return null;
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