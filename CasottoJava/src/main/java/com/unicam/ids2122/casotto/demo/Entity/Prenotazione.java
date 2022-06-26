package com.unicam.ids2122.casotto.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="prenotazioni")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private long idPrenotazione;
	@Column(name = "idcliente")
	private long idCliente;
	@Column(name = "startdate")
	private LocalDate startDate;
	@Column(name = "enddate")
	private LocalDate endDate;
	@Column(name = "type")
	private String prenotationType;
	@Column(name = "oggetto")
	private String oggettoPrenotato;

	public Prenotazione(){}

	public Prenotazione(long idCliente, LocalDate startDate, LocalDate endDate, String prenotationType, String oggettoPrenotato) {
		this.idCliente = idCliente;
		this.startDate = startDate;
		this.endDate = endDate;
		this.prenotationType = prenotationType;
		this.oggettoPrenotato = oggettoPrenotato;
	}

	public long getIdPrenotazione() {
		return this.idPrenotazione;
	}

	public long getIdCliente() {
		return this.idCliente;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public String getPrenotationType() {
		return this.prenotationType;
	}

	public String getOggettoPrenotato() {
		return this.oggettoPrenotato;
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public void setId(long idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * 
	 * @param prenotationType
	 */
	public void setPrenotationType(String prenotationType) {
		this.prenotationType = prenotationType;
	}

	/**
	 * 
	 * @param oggettoPrenotato
	 */
	public void setOggettoPrenotato(String oggettoPrenotato) {
		this.oggettoPrenotato = oggettoPrenotato;
	}

	@Override
	public String toString() {
		return String.format("Prenotazione: [ startDate: "+startDate+", endDate: "+endDate+", type: "+prenotationType+", oggetto: "+oggettoPrenotato+" ]");
	}
}