package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Attivita;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AttivitaService {

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
	Attivita createAttivita(long idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, LocalDate date, LocalTime hour);

	/**
	 * 
	 * @param idAttivita
	 */
	void deleteAttivita(long idAttivita);

	/**
	 * 
	 * @param idAttivita
	 */
	Attivita getAttivita(long idAttivita);

	List<Attivita> getAllAttivita();

	/**
	 * 
	 * @param idAttivita
	 */
	void addAttivita(long idAttivita);

	/**
	 * 
	 * @param idAttivita
	 */
	void removeAttivita(long idAttivita);

	/**
	 * 
	 * @param date
	 */
	List<Attivita> getAttivitaByDate(LocalDate date);

}