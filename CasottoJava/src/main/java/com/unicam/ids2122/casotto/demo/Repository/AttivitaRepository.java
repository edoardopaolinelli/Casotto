package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttivitaRepository {

	/**
	 * 
	 * @param a
	 */
	void save(Attivita a);

	List<Attivita> findAll();

	/**
	 * 
	 * @param id
	 */
	Attivita findById(String id);

	/**
	 * 
	 * @param a
	 */
	void delete(Attivita a);

}