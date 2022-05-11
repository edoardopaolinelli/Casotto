package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public class PrenotazioneServiceImpl implements PrenotazioneService {

	private PrenotazioneRepository prenotazioneRepository;
	private PrenotazioneService prenotazioneService;
	private Attivit�Service attivit�Service;
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
	public Prenotazione createPrenotazione(string idPrenotazione, string idUser, Date startDate, Date endDate, string prenotationType) {
		// TODO - implement PrenotazioneServiceImpl.createPrenotazione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public void deletePrenotazione(string idPrenotazione) {
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
	public List<Prenotazione> getPrenotazioniByType(string prenotazioneType) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazioniByType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public List<Prenotazione> getPrenotazioniByCliente(string idCliente) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazioniByCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startDate
	 */
	public List<Prenotazione> getPrenotazionyByStartDate(Date startDate) {
		// TODO - implement PrenotazioneServiceImpl.getPrenotazionyByStartDate
		throw new UnsupportedOperationException();
	}

}