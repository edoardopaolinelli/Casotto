package PrimaIterazione.ModelloDiProgetto;

public class Prenotazione {

	private string idPrenotazione;
	private string idCliente;
	private Date startDate;
	private Date endDate;
	private PrenotationType prenotationType;
	private Object oggettoPrenotato;

	public string getIdPrenotazione() {
		return this.idPrenotazione;
	}

	public string getIdCliente() {
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
	public void setId(string idPrenotazione) {
		// TODO - implement Prenotazione.setId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(string idCliente) {
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
	public void setPrenotationType(string prenotationType) {
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