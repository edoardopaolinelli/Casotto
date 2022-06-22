package com.unicam.ids2122.casotto.demo.Repository;


import com.unicam.ids2122.casotto.demo.Entity.Ombrellone;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OmbrelloneRepository {

	/**
	 * 
	 * @param o
	 */
	void save(Ombrellone o);

	List<Ombrellone> findAll();

	/**
	 * 
	 * @param id
	 */
	Ombrellone findById(String id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ombrellone o);

}