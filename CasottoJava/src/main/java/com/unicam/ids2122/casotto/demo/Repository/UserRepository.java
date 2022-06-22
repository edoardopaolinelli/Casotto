package com.unicam.ids2122.casotto.demo.Repository;

import com.unicam.ids2122.casotto.demo.Entity.Guest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface UserRepository {

	/**
	 * 
	 * @param g
	 */
	Guest save(Guest g);

	List<Guest> findAll();

	/**
	 * 
	 * @param id
	 */
	Guest findById(long id);

	/**
	 * 
	 * @param g
	 */
	void delete(Guest g);

}