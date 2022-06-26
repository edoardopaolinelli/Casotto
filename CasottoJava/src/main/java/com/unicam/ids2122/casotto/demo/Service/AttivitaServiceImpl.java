package com.unicam.ids2122.casotto.demo.Service;


import com.unicam.ids2122.casotto.demo.Entity.Attivita;
import com.unicam.ids2122.casotto.demo.Entity.Ombrellone;
import com.unicam.ids2122.casotto.demo.Repository.AttivitaRepository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AttivitaServiceImpl implements AttivitaService {

	private final AttivitaRepository attivitaRepository;
	private AttivitaService attivitaService;

	public AttivitaServiceImpl(AttivitaRepository attivitaRepository) {
		this.attivitaRepository = attivitaRepository;
	}

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
	public Attivita createAttivita(long idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, LocalDate date, LocalTime hour) {
		return new Attivita(name, description, maxPartecipants, actualPartecipants,date, hour);
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void deleteAttivita(long idAttivita) {
		Attivita attivita = attivitaRepository.findById(idAttivita);
		attivitaRepository.delete(attivita);
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public Attivita getAttivita(long idAttivita) {
		return attivitaRepository.findById(idAttivita);
	}

	public List<Attivita> getAllAttivita() {
		return attivitaRepository.findAll();
	}

	@Override
	public void addAttivita(long idAttivita) {
		if( attivitaRepository.findById(idAttivita) == null) {
			throw new  NullPointerException("Attivita non trovata");
		} else if(attivitaService.getAllAttivita().contains(attivitaRepository.findById(idAttivita))) {
			throw new IllegalArgumentException("Attivita già presente");
		} else {
			attivitaRepository.save(attivitaRepository.findById(idAttivita));
		}}


	/**
	 * 
	 * @param idAttivita
	 */
	public void removeAttivita(long idAttivita) {
		Attivita attivita = attivitaRepository.findById(idAttivita);
		attivitaRepository.delete(attivita);
	}

	/**
	 * 
	 * @param date
	 */
	public List<Attivita> getAttivitaByDate(LocalDate date) {
		return attivitaRepository.findAll().stream().filter(a -> a.getDate().isEqual(date)).toList();
	}

}