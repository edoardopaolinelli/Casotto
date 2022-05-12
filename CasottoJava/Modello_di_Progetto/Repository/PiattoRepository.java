package CasottoJava.Modello_di_Progetto.Repository;

import CasottoJava.Modello_di_Progetto.Entity.Piatto;

import java.util.List;

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
	Piatto findById(String id);

	/**
	 * 
	 * @param p
	 */
	void delete(Piatto p);

}