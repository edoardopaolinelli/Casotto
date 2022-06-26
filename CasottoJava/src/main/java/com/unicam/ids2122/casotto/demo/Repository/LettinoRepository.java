package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Lettino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LettinoRepository extends CrudRepository<Lettino, Long> {

	/**
	 * 
	 * @param l
	 */
	Lettino save(Lettino l);

	List<Lettino> findAll();

	/**
	 * 
	 * @param id
	 */
	Lettino findById(long id);

	/**
	 * 
	 * @param l
	 */
	void delete(Lettino l);

}