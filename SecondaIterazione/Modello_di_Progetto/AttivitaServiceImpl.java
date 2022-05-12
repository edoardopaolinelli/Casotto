package SecondaIterazione.Modello_di_Progetto;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AttivitaServiceImpl implements AttivitaService {

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

	/**
	 * 
	 * @param idCliente
	 */
	public void addCliente(String idCliente) {
		// TODO - implement AttivitaServiceImpl.addCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void removeCliente(String idCliente) {
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