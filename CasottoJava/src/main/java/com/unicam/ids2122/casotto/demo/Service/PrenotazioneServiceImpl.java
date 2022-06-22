package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Prenotazione;
import com.unicam.ids2122.casotto.demo.Repository.PrenotazioneRepository;

import java.time.LocalDate;
import java.util.List;

public class PrenotazioneServiceImpl implements PrenotazioneService {

	private final PrenotazioneRepository prenotazioneRepository;
	private PrenotazioneService prenotazioneService;
	private AttivitaService AttivitaService;
	private OmbrelloneService ombrelloneService;
	private LettinoService lettinoService;

	public PrenotazioneServiceImpl(PrenotazioneRepository prenotazioneRepository) {
		this.prenotazioneRepository = prenotazioneRepository;
	}

	/**
	 * 
	 * @param idPrenotazione
	 * @param idUser
	 * @param startDate
	 * @param endDate
	 * @param prenotationType
	 */
	//MANCAVA oggettoPrenotato SU .VPP(DA AGGIUNGERE IN PRENOTAZIONE ENTITY)
	public Prenotazione createPrenotazione(String idPrenotazione, String idUser, LocalDate startDate, LocalDate endDate, String prenotationType, Object oggettoPrenotato) {
		Prenotazione prenotazione = new Prenotazione(idPrenotazione, idUser, startDate, endDate, prenotationType, oggettoPrenotato);
		prenotazioneRepository.save(prenotazione);
		return prenotazione;
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public void deletePrenotazione(String idPrenotazione) {
		Prenotazione prenotazione = prenotazioneRepository.findById(idPrenotazione);
		prenotazioneRepository.delete(prenotazione);
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public Prenotazione getPrenotazione(String idPrenotazione) {
		return prenotazioneRepository.findById(idPrenotazione);
	}

	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneRepository.findAll();
	}

	/**
	 * 
	 * @param prenotazioneType
	 */
	public List<Prenotazione> getPrenotazioniByType(String prenotazioneType) {
		return prenotazioneRepository.findAll().stream().filter(p -> p.getPrenotationType().equals(prenotazioneType)).toList();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public List<Prenotazione> getPrenotazioniByCliente(String idCliente) {
		return prenotazioneRepository.findAll().stream().filter(p -> p.getIdCliente().equals(idCliente)).toList();
	}

	/**
	 * 
	 * @param startDate
	 */
	public List<Prenotazione> getPrenotazionyByStartDate(LocalDate startDate) {
		return prenotazioneRepository.findAll().stream().filter(p -> p.getStartDate().isEqual(startDate)).toList();
	}

}