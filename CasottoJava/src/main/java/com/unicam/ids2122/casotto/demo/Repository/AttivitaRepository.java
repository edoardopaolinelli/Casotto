package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttivitaRepository extends CrudRepository<Attivita, Long> {

	/**
	 * 
	 * @param a
	 */
	Attivita save(Attivita a);

	List<Attivita> findAll();

	/**
	 * 
	 * @param id
	 */
	Attivita findById(long id);

	/**
	 * 
	 * @param a
	 */
	void delete(Attivita a);

}