package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Prenotazione;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

	/**
	 * 
	 * @param p
	 */
	Prenotazione save(Prenotazione p);

	List<Prenotazione> findAll();

	/**
	 * 
	 * @param id
	 */
	Prenotazione findById(long id);

	/**
	 * 
	 * @param p
	 */
	void delete(Prenotazione p);

}