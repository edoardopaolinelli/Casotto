package CasottoJava.Modello_di_Progetto.Repository;


import CasottoJava.Modello_di_Progetto.Entity.Ombrellone;

import java.util.List;

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