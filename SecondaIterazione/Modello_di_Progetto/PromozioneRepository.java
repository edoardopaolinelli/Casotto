package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface PromozioneRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Promozione p);

	List<Promozioni> findAll();

	/**
	 * 
	 * @param id
	 */
	Promozione findById(string id);

	/**
	 * 
	 * @param p
	 */
	void delete(Promozione p);

}