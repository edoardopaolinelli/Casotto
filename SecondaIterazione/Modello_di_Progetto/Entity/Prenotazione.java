package SecondaIterazione.Modello_di_Progetto.Entity;

import java.time.LocalDate;

public class Prenotazione {

	private String idPrenotazione;
	private String idCliente;
	private LocalDate startDate;
	private LocalDate endDate;
	private String prenotationType;
	private Object oggettoPrenotato;

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
		// TODO - implement Prenotazione.setId
		throw new UnsupportedOperationException();
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
		// TODO - implement Prenotazione.setPrenotationType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param oggettoPrenotato
	 */
	public void setOggettoPrenotato(Object oggettoPrenotato) {
		this.oggettoPrenotato = oggettoPrenotato;
	}

}