package PrimaIterazione.ModelloDiProgetto;

public class Prenotazione {

	private String idPrenotazione;
	private String idCliente;
	private Date startDate;
	private Date endDate;
	private PrenotationType prenotationType;
	private Object oggettoPrenotato;

	public String getIdPrenotazione() {
		return this.idPrenotazione;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public PrenotationType getPrenotationType() {
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
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
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