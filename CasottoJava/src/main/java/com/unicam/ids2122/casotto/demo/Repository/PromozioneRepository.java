package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Promozione;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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