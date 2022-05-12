package CasottoJava.Modello_di_Progetto.Repository;

import CasottoJava.Modello_di_Progetto.Entity.Lettino;

import java.util.List;

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