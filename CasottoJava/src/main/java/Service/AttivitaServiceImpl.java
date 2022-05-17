package Service;


import Entity.Attivita;
import Repository.AttivitaRepository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AttivitaServiceImpl implements Service.AttivitaService {

	private AttivitaRepository attivitaRepository;
	private AttivitaService attivitaService;

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
		Attivita attivita = new Attivita(idAttivita,name,description,maxPartecipants,actualPartecipants,date,hour);
		attivitaRepository.save(attivita);
		return attivita;
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void deleteAttivita(String idAttivita) {
		Attivita attivita = attivitaRepository.findById(idAttivita);
		attivitaRepository.delete(attivita);
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public Attivita getAttivita(String idAttivita) {
		return attivitaRepository.findById(idAttivita);
	}

	public List<Attivita> getAllAttivita() {
		return attivitaRepository.findAll();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void addCliente(String idCliente) {
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
		return getAllAttivita().stream().filter(a -> a.getDate().isEqual(date)).toList();
	}

}