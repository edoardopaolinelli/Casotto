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
		// TODO - implement Attivit�ServiceImpl.createAttivit�
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void deleteAttivita(String idAttivita) {
		// TODO - implement Attivit�ServiceImpl.deleteAttivit�
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public Attivita getAttivita(String idAttivita) {
		// TODO - implement Attivit�ServiceImpl.getAttivit�
		throw new UnsupportedOperationException();
	}

	public List<Attivita> getAllAttivita() {
		// TODO - implement Attivit�ServiceImpl.getAllAttivit�
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void addCliente(String idCliente) {
		// TODO - implement Attivit�ServiceImpl.addCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void removeCliente(String idCliente) {
		// TODO - implement Attivit�ServiceImpl.removeCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public List<Attivita> getAttivitaByDate(LocalDate date) {
		// TODO - implement Attivit�ServiceImpl.getAttivit�ByDate
		throw new UnsupportedOperationException();
	}

}