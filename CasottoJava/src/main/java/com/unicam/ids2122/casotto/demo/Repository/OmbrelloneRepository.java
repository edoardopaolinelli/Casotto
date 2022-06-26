package com.unicam.ids2122.casotto.demo.Repository;


import com.unicam.ids2122.casotto.demo.Entity.Ombrellone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OmbrelloneRepository extends CrudRepository<Ombrellone, Long> {

	/**
	 * 
	 * @param o
	 */
	Ombrellone save(Ombrellone o);

	List<Ombrellone> findAll();

	/**
	 * 
	 * @param id
	 */
	Ombrellone findById(long id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ombrellone o);

}