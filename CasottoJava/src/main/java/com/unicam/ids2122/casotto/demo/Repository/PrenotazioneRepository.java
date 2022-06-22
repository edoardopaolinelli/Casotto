package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Prenotazione;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrenotazioneRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Prenotazione p);

	List<Prenotazione> findAll();

	/**
	 * 
	 * @param id
	 */
	Prenotazione findById(String id);

	/**
	 * 
	 * @param p
	 */
	void delete(Prenotazione p);

}