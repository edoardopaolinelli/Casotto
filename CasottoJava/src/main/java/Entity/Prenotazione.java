package Entity;

import java.time.LocalDate;

public class Prenotazione {

	private String idPrenotazione;
	private String idCliente;
	private LocalDate startDate;
	private LocalDate endDate;
	private String prenotationType;
	private Object oggettoPrenotato;

	public Prenotazione(){}

	public Prenotazione(String idPrenotazione, String idCliente, LocalDate startDate, LocalDate endDate, String prenotationType, Object oggettoPrenotato) {
		this.idPrenotazione = idPrenotazione;
		this.idCliente = idCliente;
		this.startDate = startDate;
		this.endDate = endDate;
		this.prenotationType = prenotationType;
		this.oggettoPrenotato = oggettoPrenotato;
	}

	public String getIdPrenotazione() {
		return this.idPrenotazione;
	}

	public String getIdCliente() {
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

	public Object getOggettoPrenotato() {
		return this.oggettoPrenotato;
	}

	/**
	 * 
	 * @param idPrenotazione
	 */
	public void setId(String idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(String idCliente) {
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
	public void setOggettoPrenotato(Object oggettoPrenotato) {
		this.oggettoPrenotato = oggettoPrenotato;
	}

}