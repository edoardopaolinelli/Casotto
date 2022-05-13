package Repository;

import Entity.Promozione;

import java.util.List;

public interface PromozioneRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Promozione p);

	List<Promozione> findAll();

	/**
	 * 
	 * @param id
	 */
	Promozione findById(String id);

	/**
	 * 
	 * @param p
	 */
	void delete(Promozione p);

}