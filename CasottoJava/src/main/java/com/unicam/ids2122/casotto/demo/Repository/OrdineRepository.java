package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Ordine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository {

	/**
	 * 
	 * @param o
	 */
	void save(Ordine o);

	List<Ordine> findAll();

	/**
	 * 
	 * @param id
	 */
	Ordine findById(String id);

	/**
	 * 
	 * @param o
	 */
	void delete(Ordine o);

}