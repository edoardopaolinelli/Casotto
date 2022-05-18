package Service;


import Entity.Attivita;
import Repository.AttivitaRepository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AttivitaServiceImpl implements Service.AttivitaService {

	private AttivitaRepository AttivitaRepository;
	private AttivitaService AttivitaService;

	/**
	 * 
	 * @param idAttivita
	 * @param name
	 * @param description
	 * @param maxPartecipants
	 * @param actualPartecipants
	 * @param date
	 * @param hour
	 */
	public Attivita createAttivita(String idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, LocalDate date, LocalTime hour) {
		// TODO - implement AttivitaServiceImpl.createAttivita
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void deleteAttivita(String idAttivita) {
		// TODO - implement AttivitaServiceImpl.deleteAttivita
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public Attivita getAttivita(String idAttivita) {
		// TODO - implement AttivitaServiceImpl.getAttivita
		throw new UnsupportedOperationException();
	}

	public List<Attivita> getAllAttivita() {
		// TODO - implement AttivitaServiceImpl.getAllAttivita
		throw new UnsupportedOperationException();
	}

	@Override
	public void addttivita(String idAttivita) {

	}


	/**
	 * 
	 * @param edAttivita
	 */
	public void removeAttivita(String edAttivita) {
		// TODO - implement AttivitaServiceImpl.removeCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public List<Attivita> getAttivitaByDate(LocalDate date) {
		// TODO - implement AttivitaServiceImpl.getAttivit�ByDate
		throw new UnsupportedOperationException();
	}

}