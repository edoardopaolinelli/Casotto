package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Piatto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PiattoRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Piatto p);

	List<Piatto> findAll();

	/**
	 * 
	 * @param id
	 */
	Piatto findById(long id);

	/**
	 * 
	 * @param p
	 */
	void delete(Piatto p);

}