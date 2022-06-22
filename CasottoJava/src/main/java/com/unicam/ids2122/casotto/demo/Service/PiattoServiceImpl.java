package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Piatto;
import com.unicam.ids2122.casotto.demo.Repository.PiattoRepository;

import java.util.List;

public class PiattoServiceImpl implements PiattoService {

	private final PiattoRepository piattoRepository;
	private PiattoService piattoService;

	public PiattoServiceImpl(PiattoRepository piattoRepository) {
		this.piattoRepository = piattoRepository;
	}

	/**
	 * 
	 * @param idPiatto
	 * @param namePiatto
	 * @param description
	 * @param price
	 * @param type
	 */
	public Piatto createPiatto(long idPiatto, String namePiatto, String description, float price, String type) {
		Piatto piatto = new Piatto(idPiatto, namePiatto, description, price, type);
		piattoRepository.save(piatto);
		return piatto;
	}

	/**
	 * 
	 * @param idPiatto
	 */
	public void deletePiatto(long idPiatto) {
		Piatto piatto = piattoRepository.findById(idPiatto);
		piattoRepository.delete(piatto);
	}

	/**
	 * 
	 * @param idPiatto
	 */
	public Piatto getPiatto(long idPiatto) {
		return piattoRepository.findById(idPiatto);
	}

	public List<Piatto> getAllPiatti() {
		return piattoRepository.findAll();
	}

	/**
	 * 
	 * @param type
	 */
	public List<Piatto> getPiattiByType(String type) {
		return piattoRepository.findAll().stream().filter(p -> p.getType().equals(type)).toList();
	}

}