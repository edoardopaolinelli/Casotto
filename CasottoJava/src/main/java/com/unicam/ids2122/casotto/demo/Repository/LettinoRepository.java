package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LettinoRepository {

	/**
	 * 
	 * @param l
	 */
	void save(Lettino l);

	List<Lettino> findAll();

	/**
	 * 
	 * @param id
	 */
	Lettino findById(String id);

	/**
	 * 
	 * @param l
	 */
	void delete(Lettino l);

}