package SecondaIterazione.Modello_di_Progetto;

import java.time.LocalDate;
import java.util.List;

public class PrenotazioneServiceImpl implements PrenotazioneService {

	private PrenotazioneRepository prenotazioneRepository;
	private PrenotazioneService prenotazioneService;
	private AttivitaService AttivitaService;
	private OmbrelloneService ombrelloneService;
	private LettinoService lettinoService;

	/**
	 * 
	 * @param idPrenotazione
	 * @param idUser
	 * @param startDate
	 * @param endDate
	 * @param prenotationType
	 */
	public Prenotazione createPrenotazione(String idPrenotazione, String idUser, LocalDate startDate, LocalDate endDate, String prenotationType) {
		// TODO - implement PrenotazioneServiceImpl.createPrenotazione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public void deletePrenotazione(String idPrenotazione) {
		// TODO - implement PrenotazioneServiceImpl.deletePrenotazione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public Prenotazione getPrenotazione(int idPrenotazione) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazione
		throw new UnsupportedOperationException();
	}

	public List<Prenotazione> getAllPrenotazioni() {
		// TODO - implement PrenotazioneServiceImpl.getAllPrenotazioni
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param prenotazioneType
	 */
	public List<Prenotazione> getPrenotazioniByType(String prenotazioneType) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazioniByType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public List<Prenotazione> getPrenotazioniByCliente(String idCliente) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazioniByCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startDate
	 */
	public List<Prenotazione> getPrenotazionyByStartDate(LocalDate startDate) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazionyByStartDate
		throw new UnsupportedOperationException();
	}

}