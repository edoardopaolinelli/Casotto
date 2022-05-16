package Repository;

import Entity.Prenotazione;

import java.util.List;

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